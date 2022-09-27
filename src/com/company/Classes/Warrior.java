package com.company.Classes;

public class Warrior extends Player {


    private int stamina;
    private int strength;

    public Warrior(int id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        this.stamina = stamina;
        this.strength = strength;
    }


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "\n Warrior{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", isAlive=" + isAlive() +
                ", stamina=" + stamina +
                ", strength=" + strength +
                '}';

    }
}
