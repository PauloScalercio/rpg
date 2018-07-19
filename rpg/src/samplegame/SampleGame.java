/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplegame;

import engine.input.GenericInput;
import engine.window.Game;

/**
 *
 * @author labccet
 */
public class SampleGame extends Game {
    GenericInput keys;

    public SampleGame() {
        super(1280,720);
        keys = new GenericInput();

        addStage(new HomeTown());

        start();
    }

    @Override
    public GenericInput getInput() {
        return keys;
    }
}
