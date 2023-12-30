package com.manish.untitled_java_game.level;

import java.awt.*;
import java.awt.event.MouseEvent;

public interface Level {
    void onClick(MouseEvent e);
    void render(Graphics g);
    void update();
}
