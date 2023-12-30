package com.manish.untitled_java_game.acter;

import com.manish.untitled_java_game.animation.AnimateSprite;
import com.manish.untitled_java_game.animation.AnimationHolder;
import com.manish.untitled_java_game.objects.SpriteMetaData;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Character {
    private String imageUrl;
    private AnimationHolder animationHolder;

    private List<SpriteMetaData> characterAnimationMetaData;

    private int animationIndex = 0;
    private String animationType = "CUTTING";
    private AnimateSprite animateSprite;

    public Character(){
        loadDefault();
    }

    private void loadDefault() {
        setDefaultImageUrl();
        setDefaultCharacterAnimationMetaData();
        setCharacterAnimation();
    }

    private void setCharacterAnimation() {
        animateSprite = new AnimateSprite(20);
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    public void setCharacterAnimationMetaData(List<SpriteMetaData> characterAnimationMetaData) {
        this.characterAnimationMetaData = characterAnimationMetaData;
        setAnimationHolder();
    }

    private void setDefaultCharacterAnimationMetaData() {
        characterAnimationMetaData = new ArrayList<>();

        characterAnimationMetaData.add(new SpriteMetaData("IDEAL",0, 6));
        characterAnimationMetaData.add(new SpriteMetaData("RUNNING",1, 6));
        characterAnimationMetaData.add(new SpriteMetaData("BUILDING",2, 6));
        characterAnimationMetaData.add(new SpriteMetaData("CUTTING",3, 6));
        characterAnimationMetaData.add(new SpriteMetaData("DANCING",4, 6));
        characterAnimationMetaData.add(new SpriteMetaData("FEARING",5, 6));

        setAnimationHolder();
    }

    private void setAnimationHolder() {
        animationHolder = new AnimationHolder();
        animationHolder.setAnimationFromAsset(imageUrl, characterAnimationMetaData);
    }

    private void setDefaultImageUrl() {
        imageUrl = "src/main/resources/assets/Factions/Knights/Troops/Pawn/Blue/Pawn_Blue.png";
    }

    public void draw(Graphics g){
        g.drawImage(animationHolder.getAnimationByName(animationType).get(animationIndex), 100, 100, null);
    }

    public void update() {
        animationIndex = animateSprite.animate(animationHolder.getAnimationByName(animationType).size());
    }
}
