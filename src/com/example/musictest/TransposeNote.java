package com.example.musictest;

import java.util.ArrayList;
import java.util.List;

public class TransposeNote {
    private List<String> notes;
    public void initialize() {
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
    public String getNote(String startKey, String newKey, String note) {
        initialize();

        Integer startingValue = notes.indexOf(startKey);
        Integer newValue = notes.indexOf(newKey);
        Integer relativeValue = startingValue - newValue;

        Integer notePosition = notes.indexOf(note);
        Integer toReturn = relativeValue + notePosition;
        if (toReturn < 0) {
            return notes.get(notes.size() + toReturn);
        } else {
            return notes.get(toReturn % 12);
        }
    }
}
