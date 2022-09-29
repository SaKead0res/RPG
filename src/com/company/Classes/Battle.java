package com.company.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Battle {



    public List<Player> fightRandom (ArrayList<Player> teamA, ArrayList<Player> teamB) {

        System.out.println("YOUR TEAM IS:\n");
        for(Player p : teamA){
            System.out.println(p);
        }

        System.out.println("\n THE ENEMY'S TEAM IS:\n");
        for(Player p : teamB){
            System.out.println(p);
        }

        System.out.println("\n");

        List<Player> graveyard = new ArrayList<>();
        String winner = "";

        System.out.println("THE BATTLE STARTS!\n" +
                "GOOD LUCK!\n");

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
                System.out.println("    /\n" +
                        "O===[====================-\n" +
                        "    \\");
                for(Player p : graveyard){
                    System.out.println( p.getName() + " is dead");
                }
                System.out.println("Press Intro to continue:");
                Scanner scannerPause = new Scanner((System.in));
//                String s = scannerName.nextLine();
            };
            if (!player2.isAlive()) {
                graveyard.add(player2);
                teamB.remove(player2);
                System.out.println("    /\n" +
                "O===[====================-\n" +
                "    \\");
                for(Player p : graveyard){
                    System.out.println( p.getName() + " is dead");
                }
            }
        }

        if(teamA.size() == 0){
            winner = "teamB";
        } else{
            winner = "teamA";
        }
        System.out.println("<-------------------------------->");
        System.out.println("<-------------------------------->");
        System.out.println("The winner is " + winner);
        return graveyard;

    }
}