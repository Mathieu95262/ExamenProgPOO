package ufc;
import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;
    private int victoires;
    private int defaites;
    private int egalites;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids, List<String> titres) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = titres != null ? titres : new ArrayList<>();
        this.victoires = 0;
        this.defaites = 0;
        this.egalites = 0;
    }

    public void enregistrerVictoire() {
        victoires++;
    }

    public void enregistrerDefaite() {
        defaites++;
    }

    public void enregistrerEgalite() {
        egalites++;
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
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

    public int getVictoires() {
        return victoires;
    }
}
