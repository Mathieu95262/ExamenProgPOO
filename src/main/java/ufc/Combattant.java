package ufc;
import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids, List<String> titres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = titres;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }

    public double getPoids() {
        return poids;
    }

    public List<String> getTitres() {
        return titres;
    }
    @Override
    public String toString() {
        return "Combattant{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomCombattant='" + nomCombattant + '\'' +
                ", poids=" + poids +
                ", titres=" + titres +
                '}';
    }
}
