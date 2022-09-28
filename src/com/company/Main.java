package com.company;

import com.company.Classes.Battle;
import com.company.Classes.Player;
import com.company.Classes.TeamBuilder;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println("Enter your PJ Name");
//        Scanner scanner = new Scanner((System.in));
//        String player1 = scanner.nextLine();
//        System.out.println(player1);
//
//        ArrayList<Player> teamA = TeamBuilder.createTeam();
//        ArrayList<Player> teamB = TeamBuilder.createTeam();
//
//        System.out.println("Team A" + teamA);
//        System.out.println("Team B" + teamB);

//

//        ArrayList<Player> teamA = TeamBuilder.createTeam();
//        ArrayList<Player> teamB = TeamBuilder.createTeam();
//        ArrayList<Player> teamC = TeamBuilder.importTeamCSV();
//
//        ArrayList<Player> teamA = new ArrayList<>();
//        ArrayList<Player> teamB;
//        ArrayList<Player> teamC;
//
//        System.out.println("Team A" + teamA);
//        System.out.println("Team B" + teamB);
//        System.out.println("Team C" + teamC);

       /* Character deadCharacter = teamA.get(1);
        teamA.remove(1);
        ArrayList<Character> graveyard = new ArrayList<Character>();
        graveyard.add(deadCharacter);*/

        inicio();

    }

    public static void inicio() throws FileNotFoundException {
        printMenu();
        int option = inputPlayer();
        actions(option);

    }
    public static void printMenu(){
        System.out.println("Bienvenido a la lucha");
        System.out.println("pulsa 1 para empezar lucha");// devuelve un muerto
        System.out.println("pulsa 2 para crear tu equipo desde CSV");
        System.out.println("pulsa 0 para salir");

//        System.out.println("7-)Salir");
    }
    public static int inputPlayer(){
        Scanner inputScaner = new Scanner(System.in);
        int choice = Integer.parseInt(inputScaner.nextLine());
        while(choice < 0 || choice > 2){
            System.out.println("Incorrect Option");
            printMenu();
            choice = Integer.parseInt(inputScaner.nextLine());
        }
        return choice;
    }
    public static void actions(int opc) throws FileNotFoundException {
        ArrayList<Player> teamA;
        ArrayList<Player> teamB;

        Battle battle = new Battle();
        switch(opc){
            case 0:
                System.out.println("Gracias por paticipar");
                break;
            case 1:
                teamA = TeamBuilder.createTeam();
                teamB = TeamBuilder.createTeam();
                battle.fightRandom(teamA, teamB);
                inicio();
                break;
            case 2:
                teamA = TeamBuilder.importTeamCSV();
                teamB = TeamBuilder.importTeamCSV();
                break;

            case 3:

                break;

        }

    }


}