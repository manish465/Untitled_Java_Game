package com.manish.untitled_java_game.objects;

public class SpriteMetaData {
    private String animationName;
    private int animationLevel;
    private int animationPartition;

    public SpriteMetaData(String animationName, int animationLevel, int animationPartition) {
        this.animationName = animationName;
        this.animationLevel = animationLevel;
        this.animationPartition = animationPartition;
    }

    public String getAnimationName() {
        return animationName;
    }

    public void setAnimationName(String animationName) {
        this.animationName = animationName;
    }

    public int getAnimationLevel() {
        return animationLevel;
    }

    public void setAnimationLevel(int animationLevel) {
        this.animationLevel = animationLevel;
    }

    public int getAnimationPartition() {
        return animationPartition;
    }

    public void setAnimationPartition(int animationPartition) {
        this.animationPartition = animationPartition;
    }
}
