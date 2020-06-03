package com.example.musictest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransposeNote {
    private Map<String,Integer> musicalKeys;
    private List<String> notes;
    public void initialize() {
        musicalKeys = new HashMap<>();
        musicalKeys.put("Cb", -7);
        musicalKeys.put("Gb",-6);
        musicalKeys.put("Db",-5);
        musicalKeys.put("Ab",-4);
        musicalKeys.put("Eb",-3);
        musicalKeys.put("Bb",-2);
        musicalKeys.put("F",-1);
        musicalKeys.put("C",0);
        musicalKeys.put("G", 1);
        musicalKeys.put("D", 2);
        musicalKeys.put("A", 3);
        musicalKeys.put("E", 4);
        musicalKeys.put("B", 5);
        musicalKeys.put("F#", 6);
        musicalKeys.put("C#", 7);

        notes = new ArrayList<>();
        notes.add("C");
        notes.add("C#/Db");
        notes.add("D");
        notes.add("D#/Eb");
        notes.add("E");
        notes.add("F");
        notes.add("F#/Gb");
        notes.add("G");
        notes.add("G#/Ab");
        notes.add("A");
        notes.add("A#/Bb");
        notes.add("B");
    }
    public String getNote(String startKey, String newKey, String note) {
        initialize();
        Integer startingValue = musicalKeys.get(startKey);
        Integer newValue = musicalKeys.get(newKey);
        Integer relativeValue = startingValue - newValue;
        System.out.println(relativeValue);
        Integer notePosition = notes.indexOf(note);
        System.out.println(notePosition);
        Integer newNoteIndex;
        if (relativeValue + notePosition < 0) {
            newNoteIndex = 12 + (relativeValue + notePosition);
        } else {
            newNoteIndex = (relativeValue + notePosition);
        }
        System.out.println(newNoteIndex);
        return notes.get(newNoteIndex);
    }
}
