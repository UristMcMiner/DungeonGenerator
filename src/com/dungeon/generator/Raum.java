package com.dungeon.generator;

import java.util.LinkedList;

public class Raum {
    public boolean besucht = false;
    public int x;
    public int y;
    public String name;
    private int raumgröße;
    private int inventarwert;
    private int reihenfolge;
    private double multiplikator;
    private int höhe;
    private int breite;
    public Raum[] verbindungen;
    //0=Norden, 1=Osten, 2=Süden, 3=Westen

    public Raum (int höhe, int breite, String name) {
//        this.raumgröße = raumgröße;
//        this.inventarwert = inventarwert;
//        this.reihenfolge = reihenfolge;
//        this.multiplikator = multiplikator;
        this.höhe = höhe;
        this.breite = breite;
        this.verbindungen = new Raum [4];
        this.name = name;

    }

    public void connect (Raum raum, int himmelsrichtung_a){
        int himmelsrichtung_b = 0;
        if (himmelsrichtung_a == 0) {
            himmelsrichtung_b = 2;
        }
        if (himmelsrichtung_a == 1) {
            himmelsrichtung_b = 3;
        }
        if (himmelsrichtung_a == 2) {
            himmelsrichtung_b = 0;
        }
        if (himmelsrichtung_a == 3) {
            himmelsrichtung_b = 1;
        }
        this.verbindungen [himmelsrichtung_a] = raum;
        raum.verbindungen [himmelsrichtung_b] = this;
    }

    public void besucheNachbarn (int x, int y, LinkedList<Raum> liste) {
        this.besucht = true;
        liste.add(this);
        this.x = x;
        this.y = y;
        System.out.println ("Raum " + this.name + " X" + this.x + " Y" + this.y);
        for (int i = 0; i < this.verbindungen.length; i++) {
            if (this.verbindungen [i] != null && !this.verbindungen [i].besucht) {
                if (i == 0) {
                    this.verbindungen[i].besucheNachbarn(this.x, this.y-1, liste);
                }
                if (i == 1) {
                    this.verbindungen[i].besucheNachbarn(this.x+1, this.y, liste);
                }
                if (i == 2) {
                    this.verbindungen[i].besucheNachbarn(this.x, this.y+1, liste);
                }
                if (i == 3) {
                    this.verbindungen[i].besucheNachbarn(this.x-1, this.y, liste);
                }
            }
        }
    }

}
