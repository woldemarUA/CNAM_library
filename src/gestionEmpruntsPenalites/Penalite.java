package gestionEmpruntsPenalites;

/**
 * La classe abstraite Penalite représente une pénalité applicable à un emprunt.
 */

public abstract class Penalite {
    double montant; // Montant de la pénalité
    String motif; // Motif de la pénalité

    // Définit le motif de la pénalité
    public void setMotif(String motif) {
        this.motif = motif;
    }

    // Récupère le motif de la pénalité
    public String getMotif() {
        return motif;
    }

    // Récupère le montant de la pénalité
    public double getMontant() {
        return montant;
    }

    // Définit le montant de la pénalité
    public void setMontant(double montant) {
        this.montant = montant;
    }

    // Affiche les détails de la pénalité
    public void afficher() {
        System.out.println("Le montant de penalite est: " + montant + "EUR");
        System.err.println("Motif est:" + motif);
    }

    // Méthode pour calculer le montant, à redéfinir dans les sous-classes
    public double calculerMontant() {
        return montant;
    };

    // Méthode abstraite pour calculer la pénalité, à implémenter dans les
    // sous-classes
    public abstract double calculerPenalite();

}