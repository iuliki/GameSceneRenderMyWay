package main.java.org.exemple.personaje;

public class Gnom extends Personaj {
    private int putere;

    public Gnom(String nume, int varsta, int pozitieX, int pozitieY, int latime, int lungime, int putere) {
        super(nume, varsta, pozitieX, pozitieY, latime, lungime);
        this.putere = putere;
    }
    public int getPutere() {
        return putere;
    }

}
