package ufc;
import java.util.ArrayList;
import java.util.List;

public class Ligue_de_Combats {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matchs;

    public Ligue_de_Combats(String nom) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void ajouterCombattant(Combattant c) {
        combattants.add(c);
    }

    public void ajouterMatch(Match m) {
        matchs.add(m);
    }

    public String getNom() {
        return nom;
    }

    public List<Combattant> getCombattants() {
        return combattants;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public Combattant trouverCombattantParId(String id) {
        for (Combattant c : combattants) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    public Match trouverMatchParId(String id) {
        for (Match m : matchs) {
            if (m.getId().equals(id)) return m;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Ligue{" +
                "nom='" + nom + '\'' +
                ", nbCombattants=" + combattants.size() +
                ", nbMatchs=" + matchs.size() +
                '}';
    }
}

