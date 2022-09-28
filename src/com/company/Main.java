package com.company;

import com.company.Classes.Player;
import com.company.Classes.TeamBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your PJ Name");
        Scanner scanner = new Scanner((System.in));
        String player1 = scanner.nextLine();
        System.out.println(player1);


        ArrayList<Player> teamA = TeamBuilder.createTeam();
        ArrayList<Player> teamB = TeamBuilder.createTeam();

        System.out.println("Team A" + teamA);

        System.out.println("Team B" + teamB);

       /* Character deadCharacter = teamA.get(1);
        teamA.remove(1);

        ArrayList<Character> graveyard = new ArrayList<Character>();
        graveyard.add(deadCharacter);*/



    }



}



