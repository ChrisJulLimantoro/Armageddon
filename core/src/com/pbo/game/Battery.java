package com.pbo.game;

import com.badlogic.gdx.graphics.Texture;

public class Battery {
    private Texture back;
    private Texture front;
    private int frontX, frontY, backX, backY;

    public Battery(Texture back, Texture front) {
        this.back = back;
        this.front = front;
        this.backX = 595;
        this.backY = 45;
        this.frontX = 600;
        this.frontY = 45;
    }

    public void setFrontX(int frontX) {
        this.frontX = frontX;
    }

    public Texture getBack() {
        return back;
    }

    public Texture getFront() {
        return front;
    }

    public int getFrontX() {
        return frontX;
    }

    public int getFrontY() {
        return frontY;
    }

    public int getBackX() {
        return backX;
    }

    public int getBackY() {
        return backY;
    }
}
