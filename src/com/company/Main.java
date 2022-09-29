package com.company;

import com.company.Classes.Battle;
import com.company.Classes.Player;
import com.company.Classes.TeamBuilder;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        inicio();
    }

    public static void inicio() throws FileNotFoundException, InterruptedException {

        printMenu();
        int option = inputPlayer();
        actions(option);
    }
    public static void printMenu() throws InterruptedException {
        System.out.println( "  ___  ___ | | __| (_) ___ _ __ ___ \n" +
                " / __|/ _ \\| |/ _` | |/ _ \\ '__/ __|\n" +
                " \\__ \\ (_) | | (_| | |  __/ |  \\__ \\\n" +
                " |___/\\___/|_|\\__,_|_|\\___|_|  |___/");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("\nWelcome to SOLDIERS, Commander! \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(   "Your adventure starts here.");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("    First of all: \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("- What's your name?");
        Scanner scannerName = new Scanner((System.in));
        String player1 = scannerName.nextLine();
        System.out.println("\nAha! \n" + player1 + " is a name of brave ancestors. \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("Will see if you honor your name.\n");
        TimeUnit.MILLISECONDS.sleep(2000);
        System.out.println("A great war is coming. \n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("Prepare your team for the battle.\n");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("    /\n" +
                "O===[====================-\n" +
                "    \\");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("\nInsert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
        System.out.println("Insert 2 if you want to create your team importing a CSV:");
        System.out.println("Insert 0 to quit the adventure:\n\n");
    }
    public static int inputPlayer() throws InterruptedException {
        Scanner inputScaner = new Scanner(System.in);
        int choice = -1;
        try {
            choice = Integer.parseInt(inputScaner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not a valid option. Try again:");
            System.out.println("\nInsert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
            System.out.println("Insert 2 if you want to create your team importing a CSV:");
            System.out.println("Insert 0 to quit the adventure:\n\n");
            inputPlayer();
        }
        while(choice < 0 || choice > 2){
            System.err.println("Not a valid option. Try again:");
            System.out.println("\nInsert 1 to start the fight! I'm gonna choose your team:");// devuelve un muerto
            System.out.println("Insert 2 if you want to create your team importing a CSV:");
            System.out.println("Insert 0 to quit the adventure:\n\n");
            choice = Integer.parseInt(inputScaner.nextLine());
        }return choice;
    }
    public static void actions(int opc) throws FileNotFoundException, InterruptedException {
        ArrayList<Player> teamA;
        ArrayList<Player> teamB;
        Battle battle = new Battle();
        switch(opc){
            case 0:
                System.out.println("Thank you for playing.\n" +
                        "We gonna miss you!!! <3");
                break;
            case 1:
                teamA = TeamBuilder.createTeam();
                teamB = TeamBuilder.createTeam();
                battle.fightRandom(teamA, teamB);
                end();
                break;
            case 2:
                teamA = TeamBuilder.importTeamCSV();
                teamB = TeamBuilder.createTeam();
                battle.fightRandom(teamA, teamB);
                end();
                break;
            default:
                break;
        }
    }

    public static void end() throws FileNotFoundException, InterruptedException {
        System.out.println("Not tired?\nDo you want to play again?");
        System.out.println("\n- Insert 0 to quit the game. (coward)");
        System.out.println("\n- Insert 1 to play another battle!");
        Scanner inputScaner = new Scanner(System.in);
        int choice = Integer.parseInt(inputScaner.nextLine());
        if (choice == 0) {
            System.out.println("Thank you for playing.\n" +
                    "We gonna miss you!!! <3");
            System.out.println("\n    THE END.");
        } else if (choice == 1) {
            inicio();
        }
    }
}