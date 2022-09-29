package com.company.Classes;

import com.company.Interfaces.Attacker;

public class Warrior extends Player implements Attacker {


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

    public int getNextAttackDamage() {
        if (getStamina() >= 5) {
            return getStrength();
        }
        return getStrength() / 2;
    }
    private void spendStamina() {
        if (getStamina() >= 5) {
            setStamina(getStamina() - 5);
        }
        else {
            setStamina(getStamina() + 1);
        }
    }
    @Override
    public void attack(Player player) {
        spendStamina();
        player.setHp(player.getHp() - getNextAttackDamage());
        if (player.getHp() <= 0) player.setAlive(false);
        System.out.println(getName() + " dealt " + (player.getHp() - getNextAttackDamage()) + " damage");
    }
}