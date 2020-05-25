package com.example.musictest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class app {
    private JPanel panelMain;
    private JButton scales_button;
    private JLabel start_page;
    private JButton uploadMusicButton;
    private static JFrame frame;

    public app() {
        scales_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScalesPage.MainScales();
                frame.setVisible(false);
            }
        });
        uploadMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UploadPage.MainUpload();
                frame.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        mainScreen();
    }

    public static void mainScreen() {
        frame = new JFrame("MusicTest");
        frame.setContentPane(new app().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = 500;
        dimension.width = 500;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }
}
