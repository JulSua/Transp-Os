package com.example.musictest;

import javax.swing.*;
import java.awt.*;

/**
 * Class that runs the TransposePage.
 */
public class TransposePage {
    private JPanel transposePage;
    private static JFrame frame;
    private JButton backButton;
    private JComboBox startKeyBox;
    private JComboBox startNoteBox;
    private JComboBox newKeyBox;
    private JLabel startingKeyLabel;
    private JLabel newKeyLabel;
    private JLabel desiredNoteLabel;
    private JButton updateButton;
    private JLabel updateLabel;
    private static final int FRAME_HEIGHT = 500;
    private static final int FRAME_WIDTH = 500;
    /**
     * Initializes the transpose note screen to the desired specifications
     */
    public static void MainTranspose() {
        frame = new JFrame("Transp-Os");
        frame.setContentPane(new TransposePage().transposePage);
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
    public TransposePage() {
        backButton.addActionListener(e -> {
            app.mainScreen();
            // Sets TransposePage GUI invisible when main screen is opened.
            frame.setVisible(false);
        });
        updateButton.addActionListener(e -> {
            // Displays the transposed note
            TransposeNote update = new TransposeNote();
            String newNote = update.getNote(startKeyBox.getSelectedItem().toString(),newKeyBox.getSelectedItem().toString(),startNoteBox.getSelectedItem().toString());
            updateLabel.setText("New Note: " + newNote);
        });
    }
}
