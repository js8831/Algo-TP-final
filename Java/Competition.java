
import java.util.ArrayList;

public class Competition {
    String nom;
    int annee;
    ArrayList<String> athletes;
    ArrayList<String> epreuves;

    public Competition(String nom, int annee, ArrayList<String> athletes, ArrayList<String> epreuves) {
        this.nom = nom;
        this.annee = annee;
        this.athletes = athletes;
        this.epreuves = epreuves;
    }

    boolean ajouterAthlete(String unAthlete) {
        return athletes.add(unAthlete);
    }

    boolean ajouterEpreuve(String uneEpreuve) {
        return epreuves.add(uneEpreuve);
    }
}
