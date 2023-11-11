package main.java.org.exemple.mediuJoc;

import main.java.org.exemple.personaje.Personaj;
import main.java.org.exemple.structuri.Casa;

public class Environment {
    private char[][] gameBoard;
    private int width;
    private int length;
    private String sceneType;
    private int numberOfHouses;

    public Environment(int width, int length, String sceneType, int numberOfHouses) {
        this.width = width;
        this.length = length;
        this.sceneType = sceneType;
        this.numberOfHouses = numberOfHouses;
        this.gameBoard = new char[width][length];
        initializeGameBoard();
    }

    private void initializeGameBoard() {

    }
    public void setMediu(String sceneType, int numberOfHouses) {
        // Plasarea casele pe tablă în funcție de tipul scenei și numărul de case
        if (sceneType.equalsIgnoreCase("European")) {
            // Logica pentru plasarea caselor de tip european
        } else if (sceneType.equalsIgnoreCase("Asian")) {
            // Logica pentru plasarea caselor de tip asiatic
        } else if (sceneType.equalsIgnoreCase("African")) {
            // Logica pentru plasarea caselor de tip african
        } else {
            System.out.println("Tip de scenă invalid.");
        }
    }


    public void displayGameBoard() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeHousesOnBoard(Casa[] houses) {
        for (Casa casa : houses) {
            int x = casa.getPozitieX();
            int y = casa.getPozitieY();
            int width = casa.getLatime();
            int length = casa.getLungime();

            boolean isPositionValid = true;

            for (int i = x; i < x + width; i++) {
                for (int j = y; j < y + length; j++) {
                    if (i < 0 || i >= width || j < 0 || j >= length || gameBoard[i][j] != 0) {
                        isPositionValid = false;
                        break;
                    }
                }
                if (!isPositionValid) {
                    break;
                }
            }

            if (isPositionValid) {
                for (int i = x; i < x + width; i++) {
                    for (int j = y; j < y + length; j++) {
                        gameBoard[i][j] = '#';
                    }
                }
            } else {
                System.out.println("Nu s-a putut plasa casa " + casa.getNume() + " la poziția specificată.");
            }
        }
    }

    public void placeCharactersOnBoard(Personaj[] characters) {
        for (Personaj character : characters) {
            int x = character.getPozitieX();
            int y = character.getPozitieY();
            int width = character.getLatime();
            int length = character.getLungime();

            boolean isPositionValid = true;

            for (int i = x; i < x + width; i++) {
                for (int j = y; j < y + length; j++) {
                    if (i < 0 || i >= width || j < 0 || j >= length || gameBoard[i][j] != 0) {
                        isPositionValid = false;
                        break;
                    }
                }
                if (!isPositionValid) {
                    break;
                }
            }

            if (isPositionValid) {
                for (int i = x; i < x + width; i++) {
                    for (int j = y; j < y + length; j++) {
                        gameBoard[i][j] = 'C';
                    }
                }
            } else {
                System.out.println("Nu s-a putut plasa personajul " + character.getNume() + " la poziția specificată.");
            }
        }
    }


    public boolean isPositionEmpty(int x, int y) {
        // Verifică dacă poziția specificată pe tablă este liberă
        return gameBoard[x][y] == 0; // Verificăm dacă este spațiu liber sau utilizăm alt criteriu specific
    }

    public boolean moveCharacter(Personaj character, int newX, int newY) {
        if (isPositionEmpty(newX, newY)) {
            int oldX = character.getPozitieX();
            int oldY = character.getPozitieY();

            gameBoard[oldX][oldY] = 0; // Eliberăm poziția veche a personajului
            gameBoard[newX][newY] = 'C'; // Mutăm personajul la noua poziție

            character.muta(newX, newY); // Actualizăm poziția personajului

            return true;
        } else {
            System.out.println("Poziția specificată [" + newX + "," + newY + "] este deja ocupată.");


            return false;
        }
    }

    public boolean moveHouse(Casa house, int newX, int newY) {
        if (isPositionEmpty(newX, newY)) {
            int oldX = house.getPozitieX();
            int oldY = house.getPozitieY();

            gameBoard[oldX][oldY] = 0;
            gameBoard[newX][newY] = '#';

            house.muta(newX, newY);

            return true;
        } else {
            System.out.println("Poziția specificată este deja ocupată.");
            return false;
        }
    }
}
