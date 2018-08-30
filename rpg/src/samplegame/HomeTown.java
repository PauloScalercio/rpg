/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplegame;

import engine.main.Stage;
import java.awt.Graphics2D;
import java.util.ArrayList;


public class HomeTown extends Stage {
    // protected Music bgm;
    ArrayList<NPC> villagers;
    ArrayList<Arvore> arvores;
    ArrayList<Casa> casas;
    
    public HomeTown() {
        villagers = new ArrayList<>();
        arvores = new ArrayList<>();
        casas = new ArrayList<>();
        
        //Game design para definir localizações de elementos
        
        int cX = 640; // horizontal center
        int cY = 360; // vertical center
        int dist = 50; // distance between objects
        int side = 7; // how many villagers per dimension
        int half = (side-1)/2;
        for( int i = 0; i < side; i++ )
            for( int j = 0; j < side; j++ )
            villagers.add(new NPC(cX - half*dist + dist*i,
                                  cY - half*dist + dist*j ) );

        for( NPC person : villagers )
            addObject( person );
        
        for( Arvore arvore : arvores )
            addObject( arvore );
        
        for( Casa casa : casas )
            addObject( casa );
    }
    

    public void nextStage() {};
}
