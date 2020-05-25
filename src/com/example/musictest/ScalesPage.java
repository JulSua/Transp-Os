package com.example.musictest;

import com.sun.org.apache.xpath.internal.operations.Minus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScalesPage {
    private JPanel scalesPage;
    private JButton playButton;
    private JLabel display_current_transpose;
    private JButton Minus1Button;
    private JButton Plus1Button;
    private JCheckBox TopReverse;
    private JButton backButton;
    private static JFrame frame;

    int current_transpose_value;
    static boolean isTopReverse;

    public static void MainScales() {
        frame = new JFrame("MusicTest");
        frame.setContentPane(new ScalesPage().scalesPage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension dimension = new Dimension();
        dimension.height = 500;
        dimension.width = 500;
        frame.setMinimumSize(dimension);
        frame.pack();
        frame.setVisible(true);
    }
    public ScalesPage() {
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                app.mainScreen();
                frame.setVisible(false);
            }
        });
        Minus1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_transpose_value == -12) {
                    current_transpose_value = 12;
                } else {
                    current_transpose_value--;
                }
                String display = "Current Transpose Value: " + current_transpose_value;
                display_current_transpose.setText(display);
            }
        });
        Plus1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (current_transpose_value == 12) {
                    current_transpose_value = -12;
                } else {
                    current_transpose_value++;
                }
                String display = "Current Transpose Value: " + current_transpose_value;
                display_current_transpose.setText(display);
            }
        });
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlayMusic obj = new PlayMusic();
                obj.playScale(current_transpose_value);
            }
        });
        TopReverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isTopReverse = TopReverse.getModel().isSelected();
            }
        });
    }
}
