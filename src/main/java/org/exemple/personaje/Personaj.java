package main.java.org.exemple.personaje;

import main.java.org.exemple.structuri.Sat;

public class Personaj {
    private String nume;
    private int varsta;
    private int pozitieX;
    private int pozitieY;
    private int latime;
    private int lungime;

    private Sat locatie;

    public Personaj(String nume, int varsta, int pozitieX, int pozitieY, int latime, int lungime) {
        this.nume = nume;
        this.varsta = varsta;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.latime = latime;
        this.lungime = lungime;
    }

    public Personaj() {
        // Constructor fără parametri
    }

    public Personaj(String nume) {
        this.nume = nume;
    }
    public Personaj(String nume, int pozitieX, int pozitieY, int latime, int lungime) {
        this.nume = nume;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.latime = latime;
        this.lungime = lungime;
    }
    public int getVarsta() {
        return varsta;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public int getLatime() {
        return latime;
    }

    public int getLungime() {
        return lungime;
    }
    public String getNume() {
        return nume;
    }




    public void muta(int nouaPozitieX, int nouaPozitieY) {

    }



    public void mutaInSat(Sat sat) {
        this.locatie = sat;
        sat.adaugaLocuitor(this);
    }


}
