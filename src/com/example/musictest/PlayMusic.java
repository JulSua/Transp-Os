package com.example.musictest;

import org.jfugue.player.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayMusic {
    private int current_transpose_value;
    private String[] notes= {"C4", "Db4", "D4", "Eb4","E4","F4","Gb4","G4","Ab4","A4","Bb4","B4",
            "C5", "Db5", "D5", "Eb5","E5","F5","Gb5","G5","Ab5","A5","Bb5","B5",
            "C6", "Db6", "D6", "Eb6","E6","F6","Gb6","G6","Ab6","A6","Bb6","B6",
            "C7"};
    private String[] C_scale = {"C5", "D5","E5","F5","G5","A5","B5"};
    private int[] C_scalePosition = {12,14,16,17,19,21,23};
    String newScale = "";
    public void playScale(int current_transpose_value) {
        Player player = new Player();
        for (int i = 0; i < 7; i++) {
            if (i < 6 && i >= 0) {
                newScale += notes[C_scalePosition[i]] + " ";
            } else {
                newScale += notes[C_scalePosition[i]];
            }
        }
        player.play(newScale);
    }
}
