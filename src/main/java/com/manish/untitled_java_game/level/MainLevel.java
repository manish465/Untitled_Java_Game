package com.manish.untitled_java_game.level;

import com.manish.untitled_java_game.acter.Character;

import java.awt.*;
import java.awt.event.MouseEvent;

public class MainLevel implements Level{
    private Character character;

    public MainLevel(){
        character = new Character();
    }

    public void onClick(MouseEvent e){

    }

    public void render(Graphics g) {
        character.draw(g);
    }

    public void update() {
        character.update();
    }
}
