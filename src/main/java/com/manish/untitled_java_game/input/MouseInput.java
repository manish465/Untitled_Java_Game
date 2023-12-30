package com.manish.untitled_java_game.input;

import com.manish.untitled_java_game.level.Level;

import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

public class MouseInput implements MouseInputListener {
    private Level level;

    public MouseInput(Level level){
        this.level = level;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        level.onClick(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
