package com.example.musictest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class that runs the Scales Page.
 */
public class ScalesPage {
    private JPanel scalesPage;
    private JButton playButton;
    private JLabel displayCurrentTranspose;
    private JButton minus1Button;
    private JButton plus1Button;
    private JCheckBox topReverse;
    private JButton backButton;
    private static JFrame frame;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_WIDTH = 500;

    /**
     * Instance variable for how far up or down the scale will be transposed.
     */
    public int currentTransposeValue;

    /**
     * Boolean indicating if the scale will be reversed once it hits the top.
     */
    public static boolean isTopReverse;

    /**
     * Initializes Scales Page to the desired specifications.
     */
    public static void MainScales() {
        frame = new JFrame("Transp-Os ");
        frame.setContentPane(new ScalesPage().scalesPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = FRAME_HEIGHT;
        dimension.width = FRAME_WIDTH;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Constructor that initializes all of the buttons used on this page.
     */
    public ScalesPage() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mainScreen();
                // Makes ScalesPage gui invisible when main screen is opened.
                frame.setVisible(false);
            }
        });
        minus1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ensures a loop in the values.
                if (currentTransposeValue == -12) {
                    currentTransposeValue = 12;
                } else {
                    currentTransposeValue--;
                }
                String display = "Current Transpose Value: " + currentTransposeValue;
                displayCurrentTranspose.setText(display);
            }
        });
        plus1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ensures a loop in the values.
                if (currentTransposeValue == 12) {
                    currentTransposeValue = -12;
                } else {
                    currentTransposeValue++;
                }
                String display = "Current Transpose Value: " + currentTransposeValue;
                displayCurrentTranspose.setText(display);
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Plays the transposed scale
                PlayMusic obj = new PlayMusic();
                obj.playScale(currentTransposeValue);
            }
        });
        topReverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Indicates if the checkbox is selected or not.
                isTopReverse = topReverse.getModel().isSelected();
            }
        });
    }
}
