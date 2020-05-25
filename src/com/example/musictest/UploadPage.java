package com.example.musictest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UploadPage {
    private JPanel uploadPage;
    private JButton backButton;
    private static JFrame frame;

    public static void MainUpload() {
        frame = new JFrame("MusicTest");
        frame.setContentPane(new UploadPage().uploadPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = 500;
        dimension.width = 500;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }
    public UploadPage() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mainScreen();
                frame.setVisible(false);
            }
        });
    }
}
