package main.java.org.exemple.grupuri;

import main.java.org.exemple.personaje.Om;

import java.util.ArrayList;
import java.util.List;

public class Armata {
    private List<Om> soldati;

    public Armata() {
        soldati = new ArrayList<>();
    }

    public void adaugaSoldat(Om om) {
        soldati.add(om);
    }

    public void eliminaSoldat(Om om) {
        soldati.remove(om);
    }

    public void afiseazaSoldati() {
        for (Om om : soldati) {
            System.out.println("Nume soldat: " + om.getNume());
        }
    }

}
