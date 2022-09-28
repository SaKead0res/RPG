package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class TeamBuilder {

    public static ArrayList<Player> createTeam(){

        List<String> randomName = new ArrayList<>(List.of("Gandalf", "Sauron", "Merlin", "Garen", "LeBlanc", "Lissandra", "Frozen", "Rafiki", "Judini"));

        ArrayList<Player> team = new ArrayList<Player>();

        //el jugador puede escoger tamaño equipo
        for (int i = 0; i < 6; i++){
            int hp = (int) (Math.random()*(80-10+1)+10);
            int stamina = (int) (Math.random()*(50-10+1)+10);
            int strength = (int) (Math.random()*(110-20+1)+10);
            int mana = (int) (Math.random()*(90-15+1)+15);
            int intelligence = (int) (Math.random()*(70-10+1)+10);

            int randomNameIndex = (int) (Math.random() * randomName.size());

            if (Math.random()< 0.5) {
                team.add(new Warrior(i, randomName.get(randomNameIndex), hp, true, stamina, strength));
            } else {
                team.add(new Wizard(i, randomName.get(randomNameIndex), hp, true, mana, intelligence));
            }
        }
        return team;
    }

    public static ArrayList<Player> importTeamCSV() {


    }


}
