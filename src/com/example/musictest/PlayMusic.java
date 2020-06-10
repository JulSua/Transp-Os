package com.example.musictest;

import org.jfugue.player.Player;

/**
 * Class is used to construct/transpose and play musical scales.
 */
public class PlayMusic {
    private static final int LENGTH_OF_SCALE = 8;
    private static final int LENGTH_OF_REVERSE_SCALE = 6;

    // String array of notes ranging from C4 to C7.
    // This will be used to construct/transpose scales.
    private final String[] notes= {"C4", "Db4", "D4", "Eb4","E4","F4","Gb4","G4","Ab4","A4","Bb4","B4",
            "C5", "Db5", "D5", "Eb5","E5","F5","Gb5","G5","Ab5","A5","Bb5","B5",
            "C6", "Db6", "D6", "Eb6","E6","F6","Gb6","G6","Ab6","A6","Bb6","B6",
            "C7"};
    // An integer array of note positions for the C Scale, which is used as the base scale.
    private final int[] cScalePosition = {12,14,16,17,19,21,23,24};

    /**
     * Plays back the transposed scale.
     * @param currentTransposeValue takes in how far up or down the C scale is transposed.
     */
    public void playScale(int currentTransposeValue) {
        // Initialize empty string for the scale that will be played back
        String newScale = "";

        for (int i = 0; i < LENGTH_OF_SCALE; i++) {
            // Adds each transposed note to the String
            newScale += notes[cScalePosition[i] + currentTransposeValue] + " ";
        }

        ScalesPage reverseChoice = new ScalesPage();

        // Runs only if user wants to play the scale in reverse
        if (reverseChoice.isTopReverse) {
            for (int i = LENGTH_OF_REVERSE_SCALE; i >= 0; i--) {
                // Adds each transposed note to the String in the reverse order
                newScale += notes[cScalePosition[i] + currentTransposeValue] + " ";
            }
        }
        // Plays the scale
        Player player = new Player();
        player.play(newScale);
    }
}
