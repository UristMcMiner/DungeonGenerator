package com.dungeon.generator;

public class Unterkünfte extends Raum {
    public Bett [] betten;



    public Unterkünfte(int höhe, int breite, int bettenanzahl, String name) {
        super(höhe, breite,name);
        this.betten = new Bett [bettenanzahl];
        for (int i = 0; i < bettenanzahl; i++) {
            this.betten [i] = new Bett (1,1);
        }
    }


}
