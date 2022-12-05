package ca.nsidetech.cahierdenotes;

public class Matiere {
    private String nom;
    private int note;

    public Matiere(String nom, int note) {
        this.nom = nom;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
