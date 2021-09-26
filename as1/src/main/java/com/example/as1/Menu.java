/*

    Class for menu

            */

package com.example.as1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    private int choice;

    private boolean realChoice(int n){

        for (int i = 0; i < 4; i ++){

            if (n == i) return true;

        }
        return false;

    }

    public Menu() {
        choice = -1;
    }

    public void start(){

        System.out.println("Menu:\n" +
                "--------------\n" +
                "1. List games\n" +
                "2. New game\n" +
                "3. Delete game\n" +
                "0. Exit");

        System.out.println("Type your choice: ");
        Scanner reader = new Scanner(System.in);
        choice = reader.nextInt();

        while(!realChoice(choice)){

            System.out.println("Menu:\n" +
                    "--------------\n" +
                    "1. List games\n" +
                    "2. New game\n" +
                    "3. Delete game\n" +
                    "0. Exit");
            choice = reader.nextInt();
        }
        reader.close();

        //if

    }
}
