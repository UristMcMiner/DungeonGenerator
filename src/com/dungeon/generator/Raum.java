package com.dungeon.generator;

public class Raum {
    private int raumgröße;
    private int inventarwert;
    private int reihenfolge;
    private double multiplikator;
    private int höhe;
    private int breite;
    public Raum[] verbindungen;
    //0=Norden, 1=Osten, 2=Süden, 3=Westen

    public Raum (int höhe, int breite) {
//        this.raumgröße = raumgröße;
//        this.inventarwert = inventarwert;
//        this.reihenfolge = reihenfolge;
//        this.multiplikator = multiplikator;
        this.höhe = höhe;
        this.breite = breite;
        this.verbindungen = new Raum [4];

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


}
