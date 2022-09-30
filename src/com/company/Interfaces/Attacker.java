package com.company.Interfaces;

import com.company.Classes.Player;

public interface Attacker {

    int getNextAttackDamage();
    void attack(Player player) throws InterruptedException;
}
