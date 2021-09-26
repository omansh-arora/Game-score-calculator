package com.example.as1.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.InvalidPropertiesFormatException;

class playerScoreTest {

    @Test
    void getuScoreTest() {

        int score = playerScore.getuScore(4,1,15);
        assertEquals(-10,score);

    }

    @Test
    void runtimeExceptionTest() {

        assertThrows(IllegalArgumentException.class,
                ()->playerScore.getuScore(0,2,0)
        );

        assertThrows(IllegalArgumentException.class,
                ()->playerScore.getuScore(2,-2,0)
        );

    }

}