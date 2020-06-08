package com.example.musictest;

import javax.swing.*;
import java.awt.*;

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

    public static void MainTranspose() {
        frame = new JFrame("Transp-Os");
        frame.setContentPane(new TransposePage().transposePage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = 500;
        dimension.width = 500;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }

    public TransposePage() {
        backButton.addActionListener(e -> {
            app.mainScreen();
            frame.setVisible(false);
        });
        updateButton.addActionListener(e -> {
            TransposeNote update = new TransposeNote();
            String newNote = update.getNote(startKeyBox.getSelectedItem().toString(),newKeyBox.getSelectedItem().toString(),startNoteBox.getSelectedItem().toString());
            updateLabel.setText("New Note: " + newNote);
        });
    }
}
