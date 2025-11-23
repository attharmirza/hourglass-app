package view;

import javax.swing.*;
import java.awt.*;

/**
 * Primary window class for the application, this keeps track of a single
 * timer.
 */
public class Glass extends JFrame {
    public Glass() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Theme.BACKGROUND_COLOR);
    }
}
