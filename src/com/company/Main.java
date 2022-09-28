package com.company;

import com.company.Classes.Player;
import com.company.Classes.TeamBuilder;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter your PJ Name");
        Scanner scanner = new Scanner((System.in));
        String player1 = scanner.nextLine();
        System.out.println(player1);


        ArrayList<Player> teamA = TeamBuilder.createTeam();
        ArrayList<Player> teamB = TeamBuilder.createTeam();
        ArrayList<Player> teamC = TeamBuilder.importTeamCSV();

        System.out.println("Team A" + teamA);

        System.out.println("Team B" + teamB);

        System.out.println("Team C" + teamC);

       /* Character deadCharacter = teamA.get(1);
        teamA.remove(1);

        ArrayList<Character> graveyard = new ArrayList<Character>();
        graveyard.add(deadCharacter);*/



    }



}



