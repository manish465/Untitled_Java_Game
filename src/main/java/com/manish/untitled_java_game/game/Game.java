package com.manish.untitled_java_game.game;

import com.manish.untitled_java_game.input.MouseInput;
import com.manish.untitled_java_game.level.Level;
import com.manish.untitled_java_game.level.MainLevel;

import java.awt.*;

public class Game {
    private final int WIDTH = 1280;
    private final int HEIGHT = 720;

    private final Window window;
    private final Panel panel;

    private Level mainLevel;

    private static Game game;

    private final MouseInput mouseInput;

    private Game(){
        mainLevel = new MainLevel();
        mouseInput = new MouseInput(mainLevel);
        panel = new Panel(this, mouseInput);
        window = new Window(panel);
    }

    public static Game getInstance(){
        if(game == null){
            game = new Game();
        }

        return game;
    }

    public void startGame(){
        panel.setBackground(Color.BLACK);
        window.startWindow();
        new Thread(new GameLoop(this, panel)).start();
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void render(Graphics g) {
        mainLevel.render(g);
    }

    public void update() {
        mainLevel.update();
    }
}
