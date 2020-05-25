package com.example.musictest;

import javax.swing.*;
import java.awt.*;

public class UploadPage {
    private JPanel uploadPage;

    public static void MainUpload() {
        JFrame frame = new JFrame("MusicTest");
        frame.setContentPane(new UploadPage().uploadPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = 500;
        dimension.width = 500;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }
}
