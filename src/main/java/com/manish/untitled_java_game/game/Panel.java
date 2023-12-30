package com.manish.untitled_java_game.game;

import com.manish.untitled_java_game.input.MouseInput;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Game game;
    public Panel(Game game, MouseInput mouseInput) {
        this.game = game;
        addMouseListener(mouseInput);
        setPreferredSize(new Dimension(game.getWIDTH(), game.getHEIGHT()));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);
    }

}
