package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class Battle {

    public List<Player> fightRandom (Player player1, Player player2) {

        List<Player> result = new ArrayList<>();
        Player p1;
        Player p2;

        if (player1 instanceof Warrior) {
            p1 = (Warrior) player1;

        } else {
            p1 = (Wizard) player1;
        }

        if (player2 instanceof Warrior) {
            p2 = (Warrior) player2;

        } else {
            p2 = (Wizard) player2;
        }

        while (p1.isAlive() && p2.isAlive()) {
            p1.setHp(p1.getHp() - p2.attack());
            p2.setHp(p2.getHp() - p1.attack());
            if (p1.getHp() <= 0) p1.setAlive(false);
            if (p1.getHp() <= 0) p2.setAlive(false);
        }
        if (!p1.isAlive()) result.add(p1);
        if (!p2.isAlive()) result.add(p2);
        return result;
    }
}
