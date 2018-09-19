package Pokemon;

import Pokemon.game.Background;
import Pokemon.game.Flower;
import Pokemon.game.NPC;
import Pokemon.game.Player;
import engine.graphics.Color;
import engine.input.GenericInput;
import engine.window.Game;

public class PokemonGame extends Game {
    public PokemonGame() {
        super(800, 600);
        setTitle("Pokemon");
        frameRate = 60;
        
        Background background = new Background();
        background.setPosition(240,300);
        addObject(background);
        
        Flower flower;

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {

                flower = new Flower();
                flower.setPosition(320 + x*16, 320 + y*16);
                addObject(flower);

            }
        }
        NPC npc = new NPC();
        npc.setPosition(480,480);
        addObject(npc);
        Player player = new Player();
        player.setPosition(480, 480);
        addObject(player);

        start();
    }

    static GenericInput controller;

    public GenericInput getInput() {
        if (controller == null) {
            controller = new GenericInput();
            controller.applyDefaultBinding();
        }

        return controller;
    }
}
