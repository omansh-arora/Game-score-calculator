package com.example.as1.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

public class Game {

    private ArrayList<Integer> scores;
    private ArrayList<Integer> winners = new ArrayList<>();

    String stamp;

    public Game(ArrayList<Integer> score) {
        scores = score;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        stamp = now.format(formatter);


        int max = scores.get(0);
        for (int i = 1; i < scores.size(); i++) {

            if (scores.get(i)>max) max = scores.get(i);

        }
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i)==max){

                winners.add(i+1);

            }
        }

    }

    public String toString() {
        String str = "";
        for (int i = 0; i < scores.size()-1;i++){

            str += scores.get(i);
            str += " vs ";

        }
        str += scores.get(scores.size()-1);
        str += ", winner(s): ";

        for (int i = 0; i < winners.size(); i++) {

            str += winners.get(i);
            if(i != winners.size()-1) {
                str += ", ";
            }
        }
        str += " (@" + stamp + ")";

        return str;

    }
}
