package com.example.musictest;

import javax.swing.*;
import java.io.File;

/**
 * Class that allows a file to be opened from the device's File Explorer.
 */
public class OpenFile {
    private JFileChooser fileChooser = new JFileChooser();

    /**
     * Instance variable for the file that will be selected.
     */
    public File file;

    /**
     * Checks if file can be opened and stores the selected file.
     */
    public void opener() {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        }
    }
}
