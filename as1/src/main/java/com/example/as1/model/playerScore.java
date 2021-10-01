package com.example.as1.model;

public class playerScore {


    private static int uScore;

    public static int getuScore(int nCards, int nWagers, int sPCards){

        if (nCards < 0 || nWagers < 0 || sPCards < 0) {

            throw new IllegalArgumentException("No numbers can be negative.");

        }

        if (nCards == 0){

            if (nWagers != 0 || sPCards != 0){

                throw new IllegalArgumentException("All values must be 0 if total cards are 0");

            }

        }

        uScore = sPCards - 20;
        uScore *= (nWagers + 1);
        if (nCards >= 8) uScore += 20;

        return uScore;

    }

}
