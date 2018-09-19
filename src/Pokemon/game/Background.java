package Pokemon.game;

import engine.graphics.Sprite;
import engine.main.GameObject;

import java.awt.*;

public class Background extends GameObject {

    public Background() {
    	currentSprite = new Sprite(274, 203, "/images/background.png").setFramesPerFrame(2000);
                

    }
}
