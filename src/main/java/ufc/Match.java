package ufc;

import java.time.LocalDate;

public class Match {
    private String id;
    private LocalDate date;
    private String endroit;
    private Combattant combattant1;
    private Combattant combattant2;

    public Match(String id, LocalDate date, String endroit, Combattant combattant1, Combattant combattant2) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant1 = combattant1;
        this.combattant2 = combattant2;
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

    @Override
    public String toString() {
        return "Match{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", endroit='" + endroit + '\'' +
                ", combattant1=" + combattant1.getNomCombattant() +
                ", combattant2=" + combattant2.getNomCombattant() +
                '}';
    }
}
