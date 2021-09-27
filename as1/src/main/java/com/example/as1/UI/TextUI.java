/*

    Class for menu

            */

package com.example.as1.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.example.as1.model.GameManager;
import com.example.as1.model.Game;
import com.example.as1.model.playerScore;


public class TextUI {

    private int choice;
    private GameManager gm;
    private Scanner reader = new Scanner(System.in);


    private boolean realChoice(int n){

        for (int i = 0; i < 4; i ++){

            if (n == i) return true;

        }
        return false;

    }

    public TextUI(GameManager gm1){

        gm = gm1;

    }

    public void start(){

        choice = -1;

        System.out.println("Menu:\n" +
                "--------------\n" +
                "1. List games\n" +
                "2. New game\n" +
                "3. Delete game\n" +
                "0. Exit");

        System.out.println("Type your choice: ");
        choice = reader.nextInt();

        while(!realChoice(choice)){

            System.out.println("Please enter a valid option: ");
            choice = reader.nextInt();
        }

        if( choice == 0){

            System.exit(0);

        }
        else if(choice == 1){

            if (gm.getNumGames()==0){
                System.out.println("No games found.\n");
            } else{

                for (int i = 0; i < gm.getNumGames(); i++){

                    System.out.println(i+1 + ". " + gm.gameList().get(i));

                }

            }

            start();

        }
        else if (choice == 2){

            int players;

            int nCards;
            int nWagers;
            int sumPCards;

            ArrayList<Integer>gScores = new ArrayList<>();
            Game curr;

            System.out.println("How many players?(1-4)");
            players = reader.nextInt();
            while (players > 4 || players < 1){

                System.out.println("Please enter a valid number from 1-4: ");
                players = reader.nextInt();

            }
            for (int i = 0; i < players; i++) {

                System.out.println("Player " + (i + 1) + '\n' + "----------");
                System.out.println("How many cards?");
                nCards = reader.nextInt();
                System.out.println("How many wagers?");
                nWagers = reader.nextInt();
                System.out.println("Sum of cards?");
                sumPCards = reader.nextInt();

                gScores.add(playerScore.getuScore(nCards,nWagers,sumPCards));


            }

            curr = new Game(gScores);
            gm.addGame(curr);

            System.out.println("Adding game: ");
            System.out.println(curr.toString());

            start();

        }
        else if (choice == 3){

            if (gm.getNumGames()==0){
                System.out.println("No games found.\n");
            } else{

                for (int i = 0; i < gm.getNumGames(); i++){

                    System.out.println(i+1 + ". " + gm.gameList().get(i));

                }

                int n;
                System.out.println('\n');
                System.out.println("Which game to delete (0 for none)?");
                n = reader.nextInt();
                while(n > gm.getNumGames() || n < 0){

                    System.out.println("Please enter a valid option: ");
                    n = reader.nextInt();

                }
                if (n != 0){

                    gm.remGame(n);
                    System.out.println("Game removed.");

                }
                start();

            }



        }

    }
}
