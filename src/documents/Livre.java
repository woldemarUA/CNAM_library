package documents;

import utilisateurs.Resumable;

/**
 * Classe représentant un livre, qui est un type de document.
 */

public class Livre extends Document implements Resumable, Empruntable {
    String auteur;
    String genre;

    /**
     * Constructeur de la classe Livre.
     * 
     * @param id     L'identifiant du livre.
     * @param titre  Le titre du livre.
     * @param etat   L'état actuel du livre.
     * @param auteur L'auteur du livre.
     * @param genre  Le genre du livre.
     */

    public Livre(int id, String titre, EtatDocument etat, String auteur, String genre) {
        super(id, titre, etat);
        this.auteur = auteur;
        this.genre = genre;
    }

    /**
     * Récupère l'auteur du livre.
     * 
     * @return L'auteur du livre.
     */

    public String getAuteur() {
        return auteur;
    }

    /**
     * Définit un nouvel auteur pour le livre.
     * 
     * @param auteur Le nouvel auteur du livre.
     */

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * Récupère le genre du livre.
     * 
     * @return Le genre du livre.
     */

    public String getGenre() {
        return genre;
    }

    /**
     * Définit un nouveau genre pour le livre.
     * 
     * @param genre Le nouveau genre du livre.
     */

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean estDisponible() {
        return etat == EtatDocument.DISPONIBLE;
    }

    @Override
    public void emprunter() {
        changerEtat(EtatDocument.EMPRUNTE);
    }

    @Override
    public void rendre() {
        changerEtat(EtatDocument.DISPONIBLE);
    }

    @Override
    public void resumer(Document d) {
        System.out.println("Résumé de document: ");
        System.out.println("Titre: " + d.getTitre());
        System.out.println(
                "Disponible: " + "Document " + (estDisponible() ? " est " : "n'est") + "pas disponible");
        System.out.println("Etat: " + d.getEtat());
        System.out.println("Auteur: " + auteur);
        System.out.println("Genre: " + genre);
    }

    @Override
    public String toString() {
        return super.toString() + "auteur=" + auteur + ", genre=" + genre + "}";
    }

}