package documents;

import java.time.LocalDate;

/**
 * Classe représentant un magazine, qui est un type de périodique.
 */

public class Magazine extends Periodique {

    String editeur;

    /**
     * Constructeur de la classe Magazine.
     * 
     * @param id              L'identifiant du magazine.
     * @param titre           Le titre du magazine.
     * @param etat            L'état actuel du magazine.
     * @param datePublication La date de publication du magazine.
     * @param editeur         L'éditeur du magazine.
     */

    public Magazine(int id, String titre, EtatDocument etat, LocalDate datePublication, String editeur) {
        super(id, titre, etat, datePublication);
        this.editeur = editeur;
    }

    /**
     * Récupère l'éditeur du magazine.
     * 
     * @return L'éditeur du magazine.
     */
    public String getEditeur() {
        return editeur;
    }

    /**
     * Définit un nouveau editeur pour le livre.
     * 
     * @param editeur Le nouveau editeur du livre.
     */

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    @Override
    public String toString() {
        return super.toString() + ", editeur =" + editeur + "}";
    }

}