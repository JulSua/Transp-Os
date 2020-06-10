package com.example.musictest;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that transposes one note from one instrument's key to another
 */
public class TransposeNote {
    // Number of notes within the Circle of Fifths.
    private static final int NUMBER_OF_NOTES = 12;

    // Initializes a list of the notes within the Circle of Fifths.
    private List<String> notes;
    private void initialize() {
        notes = new ArrayList<>();
        notes.add("Bb");
        notes.add("F");
        notes.add("C");
        notes.add("G");
        notes.add("D");
        notes.add("A");
        notes.add("E");
        notes.add("B");
        notes.add("F#");
        notes.add("C#");
        notes.add("G#");
        notes.add("D#");
    }

    /**
     * Function that transposes a note from startKey to newKey.
     * @param startKey takes in user's desired starting key.
     * @param newKey takes in user's desired new key.
     * @param note takes in note to be transposed.
     * @return the transposed note.
     */
    public String getNote(String startKey, String newKey, String note) {
        initialize();

        Integer startingValue = notes.indexOf(startKey);
        Integer newValue = notes.indexOf(newKey);

        // Relative value is the numerical distance between startKey and newKey, but is negative to account for shifting between two instrument keys.
        Integer relativeValue = startingValue - newValue;

        Integer notePosition = notes.indexOf(note);
        Integer toReturn = relativeValue + notePosition;

        // Makes sure that toReturn is within the list's range.
        if (toReturn < 0) {
            return notes.get(NUMBER_OF_NOTES + toReturn);
        } else {
            return notes.get(toReturn % NUMBER_OF_NOTES);
        }
    }
}
