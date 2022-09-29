package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class Battle {



    public List<Player> fightRandom (ArrayList<Player> teamA, ArrayList<Player> teamB) {

        for(Player p : teamA){
            System.out.println(p);
        }
        System.out.println("<-------------------------------->");
        System.out.println("<-------------------------------->");

        for(Player p : teamB){
            System.out.println(p);
        }

        List<Player> graveyard = new ArrayList<>();
        String winner = "";

        while (teamA.size() > 0 && teamB.size() > 0){

            Player player1 = teamA.get(0);
            Player player2 = teamB.get(0);

            while (player1.isAlive() && player2.isAlive()) {
                player1.attack(player2);
                player2.attack(player1);
            }

            if (!player1.isAlive()) {
                graveyard.add(player1);
                teamA.remove(player1);
            };
            if (!player2.isAlive()) {
                graveyard.add(player2);
                teamB.remove(player2);
            }
        }

        if(teamA.size() == 0){
            winner = "teamB";
        } else{
            winner = "teamA";
        }
        for(Player p : graveyard){
            System.out.println("<-------------------------------->");
            System.out.println("<-------------------------------->");
            System.out.println( p.getName() + "is dead");
        }
        System.out.println("<-------------------------------->");
        System.out.println("<-------------------------------->");
        System.out.println("The winner is " + winner);
        return graveyard;

    }
}