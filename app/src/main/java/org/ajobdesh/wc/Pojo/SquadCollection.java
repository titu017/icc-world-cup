package org.ajobdesh.wc.Pojo;

import org.ajobdesh.wc.R;

import java.util.ArrayList;
import java.util.List;

public class SquadCollection {
    public static List<Squad> getSquadPlayers(){
        List<Squad> squadPlayers = new ArrayList<>();
        Squad squadPlayer = null;

        //Add data to collection

        squadPlayer = new Squad();
        squadPlayer.setOne_serialTv("1");
        squadPlayer.setTwo_TeamImageIv(R.drawable.bangladesh);
        squadPlayer.setThree_teamNameTv("Bangladesh");

        squadPlayer.setPlayer1firstName("Sakib Al");
        squadPlayer.setPlayer1lastName("Hasan");
        squadPlayer.setPlayer1Position("All Rounder");

        squadPlayer.setPlayer1firstName("Mashrafee");
        squadPlayer.setPlayer1lastName("Mortaza");
        squadPlayer.setPlayer1Position("Bowler");

        squadPlayer.setPlayer1firstName("Sakib Al");
        squadPlayer.setPlayer1lastName("Hasan");
        squadPlayer.setPlayer1Position("All Rounder");

        squadPlayer.setPlayer1firstName("Sakib Al");
        squadPlayer.setPlayer1lastName("Hasan");
        squadPlayer.setPlayer1Position("All Rounder");

        squadPlayer.setPlayer1firstName("Sakib Al");
        squadPlayer.setPlayer1lastName("Hasan");
        squadPlayer.setPlayer1Position("All Rounder");

        squadPlayers.add(squadPlayer);


        return squadPlayers;
    }

}
