package com.manish.untitled_java_game.game;

import javax.swing.*;

public class Window {
    private final JFrame frame;

    public Window(Panel panel) {
        frame = new JFrame();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);

    }

    public void startWindow(){
        frame.setVisible(true);
    }
}
