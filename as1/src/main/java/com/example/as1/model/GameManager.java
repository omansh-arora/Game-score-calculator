package com.example.as1.model;

import java.util.ArrayList;
import java.util.List;

public class GameManager {

    private List<Game> games = new ArrayList<>();
    private int numGames;


    public GameManager() {

        this.numGames = 0;

    }

    public void addGame(Game g){

        games.add(g);
        numGames++;

    }

    public void remGame(int n){

        games.remove(n-1);
        numGames--;

    }

    public int getNumGames() {
        return numGames;
    }

    public List<Game> gameList(){

        return games;

    }
}
