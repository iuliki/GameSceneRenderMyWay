package main.java.org.exemple.personaje;
public class Om extends Personaj {
    private String job;

    public Om(String nume, int varsta, int pozitieX, int pozitieY, int latime, int lungime, String job) {
        super(nume, varsta, pozitieX, pozitieY, latime, lungime);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public String getNume() {
        return super.getNume();
    }
}

