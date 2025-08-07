package ufc;

import java.util.ArrayList;
import java.util.List;

public class Ligue {
    private final String nom;
    private final List<Combattant> combattants;
    private final List<Match> matchs;

    public Ligue(String nom) {
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

    public List<Match> getMatchsParCombattant(Combattant c) {
        List<Match> resultats = new ArrayList<>();
        for (Match m : matchs) {
            if (m.getCombattant1().equals(c) || m.getCombattant2().equals(c)) {
                resultats.add(m);
            }
        }
        return resultats;
    }

    public List<Combattant> getCombattants() {
        return combattants;
    }

    public List<Match> getMatchs() {
        return matchs;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Ligue " + nom + " avec " + combattants.size() + " combattants et " + matchs.size() + " matchs.";
    }
}
