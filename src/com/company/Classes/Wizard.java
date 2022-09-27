package com.company.Classes;

import com.company.Interfaces.Attacker;

public class Wizard extends Player implements Attacker {



    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "\n Wizard{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", isAlive=" + isAlive() +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

    @Override
    public int attack() {
        if (getMana() >= 5) {
            setMana(getMana() - 5);
            return getIntelligence();
        }
        setMana(getMana() + 1);
        return 2;
    }
}
