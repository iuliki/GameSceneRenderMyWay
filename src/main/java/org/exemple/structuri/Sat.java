package main.java.org.exemple.structuri;

import main.java.org.exemple.personaje.Personaj;

import java.util.ArrayList;
import java.util.List;

public class Sat {
    private List<Personaj> locuitori;
    private CasaAfricana casa;
    // Alte atribute specifice unui sat


    public Sat() {
        locuitori = new ArrayList<>();
    }

    public void adaugaLocuitor(Personaj personaj) {
        locuitori.add(personaj);
        System.out.println(personaj.getNume() + " a fost adăugat în sat.");
    }
    public void afiseazaLocuitori() {
        System.out.println("Locuitorii din sat sunt:");
        for (Personaj locuitor : locuitori) {
            System.out.println(locuitor.getNume());
        }
    }
    public void adaugaCasa(CasaAfricana casa) {
        this.casa = casa;
        casa.afiseazaConstruire();
        for (Personaj locuitor : locuitori) {
            casa.adaugaLocuitor(locuitor);
        }
    }
}



