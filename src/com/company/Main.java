package com.company;

import com.company.Classes.Player;
import com.company.Classes.TeamBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

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

       /* Character deadCharacter = teamA.get(1);
        teamA.remove(1);
        ArrayList<Character> graveyard = new ArrayList<Character>();
        graveyard.add(deadCharacter);*/
        printMenu();
        int option = inputPlayer();
        actions(option);
    }
    public static void printMenu(){
        System.out.println("Bienvenido a la lucha");
        System.out.println("pulsa 1 para seleccionar tu primer Wizard");
        System.out.println("pulsa 2 para seleccionar tu primer Warrior");
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
        inputScaner.close();
        return choice;
    }
    public static void actions(int opc){
        switch(opc){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }

    }


}



