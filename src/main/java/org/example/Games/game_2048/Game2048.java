package org.example.Games.game_2048;

import java.util.Random;

public class Game2048 {
    private static int[][] board;
    private static final int SIZE = 4;
    private Random random;

    public Game2048(){
        board = new int[SIZE][SIZE];
        random = new Random();
    }

    
}
