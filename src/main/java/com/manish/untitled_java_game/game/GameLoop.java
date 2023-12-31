package com.manish.untitled_java_game.game;

public class GameLoop implements Runnable {
    private final Game game;
    private final Panel panel;

    public GameLoop(Game game, Panel panel) {
        this.game = game;
        this.panel = panel;
    }

    @SuppressWarnings("InfiniteLoopStatement")
    @Override
    public void run() {
        int FPS_SET = 120;
        int UPS_SET = 200;

        double timePerFrame = 1000000000.0 / FPS_SET;
        double timePerUpdate = 1000000000.0 / UPS_SET;

        long previousTime = System.nanoTime();

        int frames = 0;
        int updates = 0;
        long lastCheck = System.currentTimeMillis();

        double deltaU = 0;
        double deltaF = 0;

        while (true) {

            long currentTime = System.nanoTime();

            deltaU += (currentTime - previousTime) / timePerUpdate;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (deltaU >= 1) {

                game.update();
                updates++;
                deltaU--;

            }

            if (deltaF >= 1) {

                panel.repaint();
                frames++;
                deltaF--;

            }

            if (System.currentTimeMillis() - lastCheck >= 1000) {

                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames + " | UPS: " + updates);
                frames = 0;
                updates = 0;

            }
        }
    }
}
