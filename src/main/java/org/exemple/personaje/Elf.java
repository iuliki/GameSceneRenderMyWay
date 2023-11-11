package main.java.org.exemple.personaje;

public class Elf extends Personaj {
    private String magie;

    public Elf(String nume, int varsta, int pozitieX, int pozitieY, int latime, int lungime, String magie) {
        super(nume, varsta, pozitieX, pozitieY, latime, lungime);
        this.magie = magie;
    }


}
