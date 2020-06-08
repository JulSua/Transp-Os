package com.example.musictest;

import org.jfugue.player.Player;

public class PlayMusic {
    private String[] notes= {"C4", "Db4", "D4", "Eb4","E4","F4","Gb4","G4","Ab4","A4","Bb4","B4",
            "C5", "Db5", "D5", "Eb5","E5","F5","Gb5","G5","Ab5","A5","Bb5","B5",
            "C6", "Db6", "D6", "Eb6","E6","F6","Gb6","G6","Ab6","A6","Bb6","B6",
            "C7"};
    private int[] C_scalePosition = {12,14,16,17,19,21,23,24};

    String newScale = "";

    public void playScale(int current_transpose_value) {
        Player player = new Player();
        for (int i = 0; i < 8; i++) {
            newScale += notes[C_scalePosition[i] + current_transpose_value] + " ";
        }
        ScalesPage reverseChoice = new ScalesPage();
        if (reverseChoice.isTopReverse) {
            for (int i = 6; i >= 0; i--) {
                newScale += notes[C_scalePosition[i] + current_transpose_value] + " ";
            }
        }
        player.play(newScale);
    }
}
