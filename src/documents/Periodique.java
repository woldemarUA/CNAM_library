package documents;

import java.time.LocalDate;

/**
 * Classe représentant un périodique, qui est un type de document.
 */

public class Periodique extends Document implements Empruntable {
    LocalDate datePublication;

    /**
     * Constructeur de la classe Periodique.
     * 
     * @param id              L'identifiant du périodique.
     * @param titre           Le titre du périodique.
     * @param etat            L'état actuel du périodique.
     * @param datePublication La date de publication du périodique.
     */

    public Periodique(int id, String titre, EtatDocument etat, LocalDate datePublication) {
        super(id, titre, etat);
        this.datePublication = datePublication;

    }

    /**
     * Récupère la date de publication du périodique.
     * 
     * @return La date de publication du périodique.
     */

    public LocalDate getDatePublication() {
        return datePublication;
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
    public String toString() {
        return super.toString() + ", datePublication=" + datePublication + "}";
    }

}