package com.company;

import Classes.Character;
import Classes.Warrior;
import Classes.Wizard;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayList<Character> teamA = createTeam();
        ArrayList<Character> teamB = createTeam();

        System.out.println("Team A" + teamA);

        System.out.println("Team B" + teamB);

       /* Character deadCharacter = teamA.get(1);
        teamA.remove(1);

        ArrayList<Character> graveyard = new ArrayList<Character>();
        graveyard.add(deadCharacter);*/

    }

    public static ArrayList<Character> createTeam(){
        ArrayList<Character> team = new ArrayList<Character>();

        for (int i = 0; i < 6; i++){
            int hp = (int) (Math.random()*(80-10+1)+10);
            int stamina = (int) (Math.random()*(50-10+1)+10);
            int strength = (int) (Math.random()*(110-20+1)+10);
            int mana = (int) (Math.random()*(90-15+1)+15);
            int intelligence = (int) (Math.random()*(70-10+1)+10);

            if (Math.random()< 0.5) {
                team.add(new Warrior(i, "Gimli", hp, true, stamina, strength));
            } else {
                team.add(new Wizard(i, "Gandalf", hp, true, mana, intelligence));
            }
        }
        return team;
    }
}