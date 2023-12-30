package com.manish.untitled_java_game.animation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimationLoader {
    public static List<Image> getAnimationFromAssetSetByLevel(String imageUrl, int level, int partition){
        List<Image> animation = new ArrayList<>();
        BufferedImage image;

        try {
            image = ImageIO.read(new File(imageUrl));
        } catch (IOException e) {
            System.out.println(imageUrl);
            throw new RuntimeException(e);
        }

        int subImageWidth = image.getWidth() / partition;
        int subImageHeight = image.getHeight() / partition;
        int y = level * subImageHeight;

        for(int i=0; i < partition; i++){
            int x = i * subImageWidth;

            animation.add(i, image.getSubimage(x, y, subImageWidth, subImageHeight));
        }

        return animation;
    }
}
