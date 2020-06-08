package com.example.musictest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransposeNote {
    private Map<String,Integer> musicalKeys;
    private List<String> notes;
    public void initialize() {
//        musicalKeys = new HashMap<>();
//        musicalKeys.put("Cb", -7);
//        musicalKeys.put("Gb",-6);
//        musicalKeys.put("Db",-5);
//        musicalKeys.put("Ab",-4);
//        musicalKeys.put("Eb",-3);
//        musicalKeys.put("Bb",-2);
//        musicalKeys.put("F",-1);
//        musicalKeys.put("C",0);
//        musicalKeys.put("G", 1);
//        musicalKeys.put("D", 2);
//        musicalKeys.put("A", 3);
//        musicalKeys.put("E", 4);
//        musicalKeys.put("B", 5);
//        musicalKeys.put("F#", 6);
//        musicalKeys.put("C#", 7);

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
        System.out.println("Starting Key: " + startingValue);
        Integer newValue = notes.indexOf(newKey);
        System.out.println("New key: " + newValue);
        Integer relativeValue;
        relativeValue = startingValue - newValue;
        System.out.println("Relative: "+ relativeValue);
        Integer notePosition = notes.indexOf(note);
        System.out.println("Note Pos: " + notePosition);
        Integer toReturn = relativeValue + notePosition;
        System.out.println("Returning note: " + toReturn);
        if (toReturn < 0) {
            return notes.get(notes.size() + toReturn);
        } else {
            return notes.get(toReturn % 12);
        }
    }
}
