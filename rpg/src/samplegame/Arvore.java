package samplegame;

import engine.graphics.Sprite;
import engine.main.MotionObject;
import java.awt.Graphics2D;

//heran�a para objeto n�o-movel?
public class Arvore extends MotionObject {
    Sprite spriteArvore;
    
    Arvore( double x, double y ) {
        setX(x);
        setY(y);
        
        //definir sprites, s� teremos uma sprite para arvore?
        
        spriteArvore = new Sprite(64, 48, "TO BE DEFINED");
        spriteArvore.origin.set(23,8);

    }
}