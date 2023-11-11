package main.java.org.exemple.structuri;

import main.java.org.exemple.personaje.Personaj;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private  String nume;
    private int pozitieX;
    private int pozitieY;
    private int latime;
    private int lungime;

    private String material;
    public List<Personaj> locuitori;

    public Casa(int pozitieX, int pozitieY, int latime, int lungime, String material) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.latime = latime;
        this.lungime = lungime;
        this.material= material;
        this.locuitori = new ArrayList<>();
    }


    public Casa(String nume, int pozitieX, int pozitieY, int latime, int lungime) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.nume = nume;
        this.latime = latime;
        this.lungime = lungime;
    }
    public Casa(String nume, int pozitieX, int pozitieY) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.nume = nume;
    }
    public int getPozitieX() {
        return pozitieX;
    }
    public String getNume(){
        return nume;
    }
    public int getPozitieY() {
        return pozitieY;
    }
    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }
    public void adaugaLocuitor(Personaj personaj) {
        locuitori.add(personaj);
        System.out.println(personaj.getNume() + " a fost adăugat în casă.");
    }
    public void afiseazaConstruire() {
        System.out.println("O casă a fost construită.");
    }

    public void afiseazaLocuitori() {
        System.out.println("Locuitorii din sat sunt:");
        for (Personaj locuitor : locuitori) {
            System.out.println(locuitor.getNume());
        }
    }

    public void muta(int newX, int newY) {
        this.pozitieX = newX;
        this.pozitieY = newY;
    }

}