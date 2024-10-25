package documents;

public abstract class Document {

    int id;
    String titre;
    String auteur;
    int anneePublication;
    EtatDocument etat;

    public Document(int id, String titre, String auteur, int anneePublication, EtatDocument etat) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        setAnneePublication(anneePublication);
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnneePublication() {
        return this.anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        if (anneePublication < 0) {
            throw new IllegalArgumentException("L`annee de publication ne peut pas etre negatif.");
        }
        this.anneePublication = anneePublication;
    }

    public EtatDocument getEtat() {
        return etat;
    }

    public void changerEtat(EtatDocument etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Document {" + "id=" + id + ", titre='" + titre + "', auteur='" + auteur + "', anneePublication="
                + anneePublication + ", etat='" + etat + "'" + "}";
    }
}