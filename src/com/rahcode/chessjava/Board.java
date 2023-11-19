package com.rahcode.chessjava;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Board extends JPanel {
    private static final long serialVersionUID = 1L;

    public Board() {
        GridLayout gridLayout = new GridLayout(8, 8, 0, 0);
        setLayout(gridLayout);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(50, 50));

                if ((row + col) % 2 == 0) {
                    cell.setBackground(Color.WHITE);
                } else {
                    cell.setBackground(Color.BLACK);
                }

                add(cell);
            }
        }
    }
}
