package samplegame;

import engine.graphics.Sprite;
import engine.main.MotionObject;
import java.awt.Graphics2D;

//heran�a para objeto n�o-movel?
public class Casa extends MotionObject {
    Sprite spriteCasa;
    
    Arvore( double x, double y ) {
        setX(x);
        setY(y);
        
        //definir sprites, s� teremos uma sprite para casa?
        
        spriteCasa = new Sprite(64, 48, "TO BE DEFINED");
        spriteCasa.origin.set(23,8);

    }
}