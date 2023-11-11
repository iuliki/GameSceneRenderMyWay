package main.java.org.exemple.grupuri;

import main.java.org.exemple.personaje.Personaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Legiune<T extends Personaj> {
    private List<T> membri;

    public Legiune() {
        membri = new ArrayList<>();
    }

    public void adaugaMembri(T... personaje) {
        membri.addAll(Arrays.asList(personaje));
    }

    public void eliminaMembri(T... personaje) {
        membri.removeAll(Arrays.asList(personaje));
    }

    public void afiseazaMembri() {
        for (T personaj : membri) {
            System.out.println("Nume: " + personaj.getNume());
        }
    }

}
