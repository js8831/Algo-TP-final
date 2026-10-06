
public class Athlete {
    String prenom;
    String nom;
    int age;
    String pays;
    String equipe;

    public Athlete(String prenom, String nom, int age, String pays, String equipe) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.pays = pays;
        this.equipe = equipe;
    }

    String nomComplet() {
        return prenom + " " + nom;
    }

    @Override
    public String toString() {
        return nomComplet() + "(" + pays + ", " + equipe + ")";
    }
}
