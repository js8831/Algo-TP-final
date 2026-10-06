
import java.util.LinkedHashMap;
import java.util.Map;

public class Epreuve {

    // Attributs
    String nom;
    String type;
    String unite;

    // en fonction de l'epreuve temps ou distance on affectera ASC ou DESC
    String sensTri;

    // Déclaration de la Map : la clé est un Athlete, la valeur est un Double
    // (temps/distance)
    // Chaque athlete aura un résultat associé
    Map<Athlete, Double> resultats;

    // Constructeur
    public Epreuve(String nom, String type, String unite, String sensTri) {
        this.nom = nom;
        this.type = type;
        this.unite = unite;
        this.sensTri = sensTri;
        // on ne peut pas instancier map directement car c'est une interface
        // on instancie ici car resultat aura comme valeur un objet et non un type
        // primitif comme plus haut
        this.resultats = new LinkedHashMap<>();

    }

    // Méthodes
    public void enregistrerResultat(Athlete athlete, Double score) {
        resultats.put(athlete, score);
    }

    /*
     * public Athlete[] classement(){
     * // En Java, String est un objet (et non un type primitif comme int ou
     * boolean).
     * // On utilise .equals() parce que l'opérateur == sur des objets compare leurs
     * // emplacements en mémoire (si c'est exactement le même objet),
     * // alors que .equals() compare leur contenu textuel.
     * }
     */
}
