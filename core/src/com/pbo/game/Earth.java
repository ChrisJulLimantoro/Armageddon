package com.pbo.game;

import com.badlogic.gdx.graphics.Texture;

public class Earth {
    private final int maxHp;
    private int hp, diameter, x, y;
    private Texture earthImg;

    public Earth(int hp, Texture earthImg, int diameter, int x, int y) {
        this.hp = hp;
        this.maxHp = hp;
        this.earthImg = earthImg;
        this.diameter = diameter;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public Texture getEarthImg() {
        return earthImg;
    }

    public int getMaxHp() {
        return maxHp;
    }
}
