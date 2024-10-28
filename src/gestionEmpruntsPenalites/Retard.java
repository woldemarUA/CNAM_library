package gestionEmpruntsPenalites;

public class Retard extends Penalite {
    int joursRetard;

    // Constructeur qui initialise le nombre de jours de retard basé sur l'emprunt
    // et définit le motif de la pénalité
    public Retard(Emprunt emprunt) {
        this.joursRetard = emprunt.calculerRetard();
        setMotif(TypeDegradation.RETARD.name());
    }

    // Calcule le montant de la pénalité en fonction des jours de retard
    public double calculerPenalite() {
        setMontant(joursRetard > 0 ? joursRetard * 10.0 : 0.0);
        return calculerMontant();
    }

}