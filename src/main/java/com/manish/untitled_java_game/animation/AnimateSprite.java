package com.manish.untitled_java_game.animation;

public class AnimateSprite {
    private final int animationSpeed;
    private int animationIndex;
    private int animationTick = 0;

    public AnimateSprite(int animationSpeed){
        this.animationSpeed = animationSpeed;
        animationTick = 0;
        animationIndex = 0;
    }

    public int animate(int maxAnimationPartition){
        if(animationTick >= animationSpeed){
            animationTick = 0;

            if(animationIndex == maxAnimationPartition - 1){
                animationIndex = 0;
            }
            animationIndex++;
        }

        animationTick++;

        return animationIndex;
    }
}
