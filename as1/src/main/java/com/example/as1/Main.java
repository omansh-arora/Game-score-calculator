package com.example.as1;

import com.example.as1.model.GameManager;
import com.example.as1.model.*;
import com.example.as1.UI.*;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {

        GameManager gm = new GameManager();
        TextUI tu = new TextUI(gm);

        tu.start();
        //System.out.println(playerScore.getuScore(5,2,40));
    }

}
