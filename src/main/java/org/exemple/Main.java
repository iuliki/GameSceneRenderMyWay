package main.java.org.exemple;

import main.java.org.exemple.grupuri.Armata;
import main.java.org.exemple.grupuri.Legiune;
import main.java.org.exemple.mediuJoc.Environment;
import main.java.org.exemple.personaje.Elf;
import main.java.org.exemple.personaje.Gnom;
import main.java.org.exemple.personaje.Om;
import main.java.org.exemple.personaje.Personaj;
import main.java.org.exemple.structuri.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creăm câte un personaj din fiecare tip
        Elf elf = new Elf("Legolas", 100, 10, 20, 5, 5, "magie puternică");
        Gnom gnom = new Gnom("Gimli", 120, 15, 25, 4, 4, 50);
        Om om = new Om("Aragorn", 110, 12, 22, 6, 6, "ranger");

        Armata armata = new Armata();

        Om soldat1 = new Om("Soldat1", 30, 10, 10, 5, 5, "Infanterist");
        Om soldat2 = new Om("Soldat2", 28, 12, 12, 5, 5, "Artilerist");

        System.out.println("Avem 3 personaje si acestea sunt: \n");
        // Afișăm informațiile despre fiecare personaj
        System.out.println("Informații despre elf:");
        System.out.println("Nume: " + elf.getNume());
        System.out.println("Varsta: " + elf.getVarsta());
        System.out.println("Pozitie X: " + elf.getPozitieX());
        System.out.println("Pozitie Y: " + elf.getPozitieY());

        // ... și așa mai departe pentru celelalte atribute

        System.out.println("\nInformații despre gnom:");
        System.out.println("Nume: " + gnom.getNume());
        System.out.println("Putere: " + gnom.getPutere());
        System.out.println("Pozitie X: " + gnom.getPozitieX());
        System.out.println("Pozitie Y: " + gnom.getPozitieY());
        // ... și așa mai departe pentru celelalte atribute

        System.out.println("\nInformații despre om:");
        System.out.println("Nume: " + om.getNume());
        System.out.println("Job: " + om.getJob());
        System.out.println("Pozitie X: " + om.getPozitieX());
        System.out.println("Pozitie Y: " + om.getPozitieY());
        // ... și așa mai departe pentru celelalte atribute

//aici o sa creiem o armata de oameni


        System.out.println("\n Avem o armata de sodati de oamani aici:  ");
                armata.adaugaSoldat(soldat1);
                armata.adaugaSoldat(soldat2);

                armata.afiseazaSoldati();

//aici o sa avem o legiune formata din 2 personaje:
        System.out.println("\n Aici o sa avem o legiune formata din 2 personaje::  ");
        Legiune<Personaj> legiune = new Legiune<>();

        Om soldat = new Om("Soldat", 30, 10, 10, 5, 5, "Infanterist");
        Elf magician = new Elf("Magician", 150, 15, 15, 5, 5, "Telekinezie");

        legiune.adaugaMembri(soldat, magician);
        legiune.afiseazaMembri();

        System.out.println("\n Aici avem un locuitor de tip personaj care este in sat");
        Sat sat1 = new Sat();
        Personaj personaj1 = new Personaj("John");
        Personaj personaj2 = new Personaj("Alice");
       // System.out.println("\n Dupa care afisam locuitorii din sat ");
        personaj1.mutaInSat(sat1);
        personaj2.mutaInSat(sat1);

        sat1.afiseazaLocuitori();


        CasaAfricana casaAfricana = new CasaAfricana(10, 20, 8, 6, "beton");

        // Adăugarea locuitorilor în casă
        Personaj elf1 = new Elf("Elf1", 120, 12, 15, 5, 5, "Magie1");
        Personaj elf2 = new Elf("Elf2", 110, 14, 18, 5, 5, "Magie2");

        // Adăugarea locuitorilor în sat
        Sat sat2 = new Sat();
        sat2.adaugaLocuitor(elf1);
        sat2.adaugaLocuitor(elf2);

        // Adăugarea casei în sat și a locuitorilor din casă în casă
        sat2.adaugaCasa(casaAfricana);
        sat2.afiseazaLocuitori();
        casaAfricana.afiseazaLocuitori();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți lățimea tabloului: ");
        int boardWidth = scanner.nextInt();

        System.out.print("Introduceți lungimea tabloului: ");
        int boardLength = scanner.nextInt();

        System.out.print("Introduceți tipul scenei (European, Asian, African): ");
        String sceneType = scanner.next(); // Sau scanner.nextLine() pentru mai multe cuvinte


        System.out.print("Introduceți numarul de case: ");
        int numberOfHouses = scanner.nextInt();

        // Aici puteți continua să citiți și celelalte valori necesare pentru mediul de joc

        // Odată ce aveți valorile, puteți instantia clasa mediului de joc
        Environment gameEnvironment = new Environment(boardWidth, boardLength, sceneType, numberOfHouses);

        Casa house1 = new Casa("House1", 2, 3, 2, 3);
        Casa house2 = new Casa("House2", 4, 6, 2, 3);

        Personaj character1 = new Personaj("Character1", 1, 11, 1, 1, 1);
        Personaj character2 = new Personaj("Character2", 2, 11, 1, 1, 1);
        Personaj character3 = new Personaj("Character2", 3, 11, 1, 1, 1);
        Casa[] houses = {house1, house2};

        gameEnvironment.placeHousesOnBoard(houses);


        Personaj[] characters = {character1, character2};

        gameEnvironment.placeCharactersOnBoard(characters);

        gameEnvironment.displayGameBoard();

        // Mutarea personajului pe poziția (5, 5)
        if (gameEnvironment.moveCharacter(character1, 5, 5)) {
            System.out.println("Character1 a fost mutat cu succes.");
        }
        gameEnvironment.moveCharacter(character1, 5, 5);
        // Mutarea casei pe poziția (7, 7)
        if (gameEnvironment.moveHouse(house1, 7, 7)) {
            System.out.println("House1 a fost mutat cu succes.");
        }

        gameEnvironment.displayGameBoard();



        scanner.close();
    }

}

