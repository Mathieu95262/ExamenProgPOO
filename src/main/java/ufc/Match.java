package ufc;
import java.time.LocalDate;

public class Match {
    private String id;
    private LocalDate date;
    private String endroit;
    private Combattant combattant1;
    private Combattant combattant2;
    private TypeMatch type;
    private String titre;
    private int pointsCombattant1;
    private int pointsCombattant2;
    private boolean termine;

    public Match(String id, LocalDate date, String endroit, Combattant c1, Combattant c2, TypeMatch type, String titre) {
        if (type == null) throw new IllegalArgumentException("Type de match obligatoire");
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant1 = c1;
        this.combattant2 = c2;
        this.type = type;
        this.titre = titre;
        this.termine = false;
    }

    public void attribuerPoints(int points1, int points2) {
        this.pointsCombattant1 = points1;
        this.pointsCombattant2 = points2;
    }

    public void terminer() {
        if (termine) return;

        if (type == TypeMatch.AMICAUX) {
            // Rien à faire
        } else if (pointsCombattant1 > pointsCombattant2) {
            combattant1.enregistrerVictoire();
            combattant2.enregistrerDefaite();
            if (type == TypeMatch.TITRE && titre != null) {
                combattant1.ajouterTitre(titre);
            }
        } else if (pointsCombattant2 > pointsCombattant1) {
            combattant2.enregistrerVictoire();
            combattant1.enregistrerDefaite();
            if (type == TypeMatch.TITRE && titre != null) {
                combattant2.ajouterTitre(titre);
            }
        } else {
            if (type != TypeMatch.AMICAUX) {
                combattant1.enregistrerEgalite();
                combattant2.enregistrerEgalite();
            }
        }

        termine = true;
    }
    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getEndroit() {
        return endroit;
    }

    public Combattant getCombattant1() {
        return combattant1;
    }

    public Combattant getCombattant2() {
        return combattant2;
    }

    public TypeMatch getType() {
        return type;
    }

    public String getTitre() {
        return titre;
    }

    public boolean estTermine() {
        return termine;
    }

    @Override
    public String toString() {
        return "Match{" + id + " : " + combattant1 + " vs " + combattant2 + " (" + type + ")}";
    }
}