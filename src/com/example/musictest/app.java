package com.example.musictest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class that runs the main app page.
 */
public class app {
    private JPanel panelMain;
    private JButton scalesButton;
    private JLabel startPage;
    private JButton uploadMusicButton;
    private JButton transposeButton;
    private static JFrame frame;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_WIDTH = 500;

    /**
     * Constructor that initializes all of the buttons used on this page.
     */
    public app() {
        scalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScalesPage.MainScales();
                // Makes the app gui invisible when ScalesPage is opened.
                frame.setVisible(false);
            }
        });
        uploadMusicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UploadPage.MainUpload();
                // Makes the app gui invisible when UploadPage is opened.
                frame.setVisible(false);
            }
        });
        transposeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransposePage.MainTranspose();
                // Makes the app gui invisible when TransposePage is opened.
                frame.setVisible(false);
            }
        });
    }

    /**
     * Initializes main screen.
     * @param args gives an array of arguments.
     */
    public static void main(String[] args) {
        mainScreen();
    }

    /**
     * Initializes the main screen to the desired specifications.
     */
    public static void mainScreen() {
        frame = new JFrame("Transp-Os");
        frame.setContentPane(new app().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = FRAME_HEIGHT;
        dimension.width = FRAME_WIDTH;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }
}
