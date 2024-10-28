package documents;

/**
 * Classe abstraite représentant un document.
 */

public abstract class Document {

    int id;
    String titre;
    EtatDocument etat;

    /**
     * Constructeur de la classe Document.
     * 
     * @param id    L'identifiant du document.
     * @param titre Le titre du document.
     * @param etat  L'état actuel du document.
     */

    public Document(int id, String titre, EtatDocument etat) {
        this.id = id;
        this.titre = titre;
        this.etat = etat;
    }

    /**
     * Récupère l'identifiant du document.
     * 
     * @return L'identifiant du document.
     */
    public int getId() {
        return id;
    }

    /**
     * Récupère le titre du document.
     * 
     * @return Le titre du document.
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit un nouveau titre pour le document.
     * 
     * @param titre Le nouveau titre du document.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Récupère l'état actuel du document.
     * 
     * @return L'état du document.
     */
    public EtatDocument getEtat() {
        return etat;
    }

    /**
     * Change l'état du document.
     * 
     * @param etat Le nouvel état du document.
     */
    public void changerEtat(EtatDocument etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Document {" + "id=" + id + ", titre='" + titre + ", etat='" + etat + "'" + "}";
    }
}