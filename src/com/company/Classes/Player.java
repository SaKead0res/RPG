package com.company.Classes;

import com.company.Interfaces.Attacker;

public abstract class Player implements Attacker {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

    public Player(int id, String name, int hp, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {

        isAlive = alive;
    }
}
