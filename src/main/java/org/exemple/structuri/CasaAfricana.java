package main.java.org.exemple.structuri;

import main.java.org.exemple.personaje.Personaj;

public class CasaAfricana extends Casa {
    private int pozitieX;
    private int pozitieY;
    private int latime;
    private int lungime;

    public CasaAfricana (int pozitieX, int pozitieY, int latime, int lungime, String material) {
        super(pozitieX, pozitieY, latime, lungime, material);
       /* this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.latime = latime;
        this.lungime = lungime;*/
    }

    public void afiseazaConstruire() {
        System.out.println("O casă africană a fost construită.");
    }

    public void adaugaLocuitor(Personaj locuitor) {
        locuitori.add(locuitor); // Adăugăm locuitorul în lista casei
        System.out.println(locuitor.getNume() + " a fost adăugat în casa africană.");
    }

    public void afiseazaLocuitori() {
        System.out.println("Locuitorii din casa africană sunt:");
        for (Personaj locuitor : locuitori) {
            System.out.println(locuitor.getNume());
        }
    }


}
