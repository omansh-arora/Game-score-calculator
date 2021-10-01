package com.example.as1.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


class GameTest {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(6);
        Game curr = new Game(a1);
        System.out.println(curr);

    }

}