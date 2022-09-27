package com.company.Classes;

public class Wizard extends Player {



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
                "id=" + getId +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

}
