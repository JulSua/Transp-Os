package com.example.musictest;

import javax.swing.*;
import java.io.File;

public class OpenFile {
    JFileChooser fileChooser = new JFileChooser();
    StringBuilder sb = new StringBuilder();
    File file;
    public void Opener() throws Exception {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        }
        else {
            sb.append("No file was selected");
        }
    }
}
