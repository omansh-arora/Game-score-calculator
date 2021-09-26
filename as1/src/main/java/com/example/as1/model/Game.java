package com.example.as1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Game {

    private ArrayList<Integer> scores = new ArrayList<>();
    LocalDateTime stamp;
    int winner;

    public Game(ArrayList<Integer> scores, int winner) {
        this.scores = scores;
        stamp = LocalDateTime.now();
        this.winner = winner;
    }

}
