package com.company.Classes;

import java.util.ArrayList;

public class TeamBuilder {

    public TeamBuilder() {
    }

    public static ArrayList<Player> createTeam(){
        ArrayList<Player> team = new ArrayList<Player>();

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
