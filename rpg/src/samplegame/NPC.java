/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplegame;

import engine.graphics.Sprite;
import engine.main.MotionObject;
import java.awt.Graphics2D;

/**
 *
 * @author labccet
 */
public class NPC extends MotionObject {
    Sprite standardSprite;
    
    NPC( double x, double y ) {
        setX(x);
        setY(y);

        standardSprite = new Sprite(64, 48, "/images/Ship_Edgeliner.png");
        standardSprite.origin.set(23,8);

        currentSprite = standardSprite;
    }
}
