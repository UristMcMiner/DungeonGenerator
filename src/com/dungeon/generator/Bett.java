package com.dungeon.generator;

public class Bett extends Objekt {
    private int kapazität;
    private double tiefe;
    private double breite;
    private double höhe;

    public Bett (int kapazität, double tiefe, double breite, double höhe,int x, int y, String name, int id, int inventarwert) {
        super (x, y, name, id, inventarwert);
        this.kapazität = kapazität;
        this.tiefe = tiefe;
        this.breite = breite;
        this.höhe = höhe;
    }

    public Bett (int kapazität, double betthöhe) {
        super ();
        this.kapazität = kapazität;
        this.tiefe = 1;
        this.breite = 2;
        this.höhe = betthöhe;
    }

}
