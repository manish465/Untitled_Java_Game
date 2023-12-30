package com.manish.untitled_java_game.animation;

import com.manish.untitled_java_game.objects.SpriteMetaData;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimationHolder {
    private final Map<String, List<Image>> animationSet;

    public AnimationHolder(){
        animationSet = new HashMap<>();
    }

    public void setAnimationFromAsset(String imageUrl, List<SpriteMetaData> animationMetaData){
        for(SpriteMetaData animationMetaDataEntry: animationMetaData){
            List<Image> animationFromAssetByLevel = AnimationLoader.getAnimationFromAssetSetByLevel(
                            imageUrl,
                            animationMetaDataEntry.getAnimationLevel(),
                            animationMetaDataEntry.getAnimationPartition());

            setSingleAnimation(animationMetaDataEntry.getAnimationName(), animationFromAssetByLevel);
        }
    }

    public void setSingleAnimation(String animationName, List<Image> animation){
        animationSet.put(animationName, animation);
    }

    public List<Image> getAnimationByName(String animationName){
        if(animationSet.containsKey(animationName)){
            return animationSet.get(animationName);
        }

        return new ArrayList<>();
    }
}
