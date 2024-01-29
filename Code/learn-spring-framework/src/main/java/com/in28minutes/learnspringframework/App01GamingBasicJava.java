package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacManGame = new PacManGame();

        var gameRunner1 = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(pacManGame);
        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();
    }
}
