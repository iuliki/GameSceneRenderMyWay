package main.java.org.exemple.grupuri;

import main.java.org.exemple.personaje.Personaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grup {
    private List<Personaj> membri;

    public Grup() {
        membri = new ArrayList<>();
    }

    public void adaugaMembri(Personaj... personaje) {
        membri.addAll(Arrays.asList(personaje));
    }

    public void eliminaMembri(Personaj... personaje) {
        membri.removeAll(Arrays.asList(personaje));
    }

    public void afiseazaMembri() {
        for (Personaj personaj : membri) {
            System.out.println(personaj.getNume());
        }
    }

}
