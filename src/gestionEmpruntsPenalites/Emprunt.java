package gestionEmpruntsPenalites;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import documents.Document;

/**
 * La classe Emprunt gère les informations relatives à l'emprunt d'un document,
 * y compris la date d'emprunt, la durée, et les calculs de retard.
 */

public class Emprunt {

    Document document;
    LocalDate dateEmprunt;
    LocalDate dateRetour; // Date de retour prévue
    int duree;

    /**
     * Constructeur de la classe Emprunt.
     * 
     * @param document    Document emprunté
     * @param dateEmprunt Date d'emprunt
     * @param duree       Durée de l'emprunt en jours
     */

    public Emprunt(Document document, LocalDate dateEmprunt, int duree) {
        this.document = document;
        this.dateEmprunt = dateEmprunt;
        this.duree = duree;
        dateRetour = dateEmprunt.plusDays(duree);
    }

    // Calcule le nombre de jours restants avant la date de retour
    public int calculerJoursRestants(LocalDate dateEmprunt, int duree) {
        LocalDate dateRetour = dateEmprunt.plusDays(duree);
        LocalDate aujourdhuiDate = LocalDate.now();
        long joursRestants = ChronoUnit.DAYS.between(dateRetour, aujourdhuiDate);
        return (int) joursRestants;
    }

    // Affiche les informations de l'emprunt
    public void getEmpruntDonnes() {
        System.out.println("Document emprunté: " + document.getTitre());
        System.out.println("Document emptunté le: " + dateEmprunt + " pour le duree de " + duree);
        System.out.println("Il reste: " + calculerJoursRestants(dateEmprunt, duree) + " jours d\'emprunter");

    }

    // Vérifie si l'emprunt est en retard
    public boolean estEnRetard() {
        return LocalDate.now().isAfter(dateRetour);
    }

    // Calcule le nombre de jours de retard
    public int calculerRetard() {
        return estEnRetard() ? (int) Math.abs(ChronoUnit.DAYS.between(dateRetour, dateEmprunt)) : -1;
    }

    @Override
    public String toString() {
        return document.toString() + " , dateEmpunt=" + dateEmprunt + ", duree=" + duree + " }";
    }

}