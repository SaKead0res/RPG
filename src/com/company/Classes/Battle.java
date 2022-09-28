package com.company.Classes;

import java.util.ArrayList;
import java.util.List;

public class Battle {

    public List<Player> fightRandom (Player player1, Player player2) {
        List<Player> result = new ArrayList<>();

        while (player1.isAlive() && player2.isAlive()) {
            player1.attack(player2);
            player2.attack(player1);
        }

        if (!player1.isAlive()) result.add(player1);
        if (!player2.isAlive()) result.add(player2);
        return result;
    }
}
