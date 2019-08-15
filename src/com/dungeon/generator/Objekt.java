package com.dungeon.generator;

public class Objekt {
    public int x;
    public int y;
    public String name;
    private int id;
    private int inventarwert;

    public Objekt (int x, int y, String name, int id, int inventarwert) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.id = id;
        this.inventarwert = inventarwert;
    }
    public Objekt () {
        this.x = 0;
        this.y = 0;
        this.name = null;
        this.id = 0;
        this.inventarwert = 0;

    }
}
