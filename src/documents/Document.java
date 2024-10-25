package documents;

public abstract class Document {

    int id;
    String titre;

    EtatDocument etat;

    public Document(int id, String titre, EtatDocument etat) {
        this.id = id;
        this.titre = titre;
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

    public EtatDocument getEtat() {
        return etat;
    }

    public void changerEtat(EtatDocument etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Document {" + "id=" + id + ", titre='" + titre + ", etat='" + etat + "'" + "}";
    }
}