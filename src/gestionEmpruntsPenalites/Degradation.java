package gestionEmpruntsPenalites;

/**
 * La classe Degradation représente une pénalité pour dégradation d'un document.
 * Elle hérite de la classe parent Penalite.
 */

public class Degradation extends Penalite {
    TypeDegradation type; // Type de dégradation (mineur, majeur, perte)

    // Constructeur qui initialise le type de dégradation et définit le motif
    public Degradation(TypeDegradation type) {
        this.type = type;
        setMotif("Degradation: " + type.toString());
    }

    // Calcule le montant de la pénalité en fonction du type de dégradation
    public double calculerPenalite() {

        if (type == TypeDegradation.MINEUR)
            setMontant(15.00);
        if (type == TypeDegradation.MAJEUR)
            setMontant(30.00);
        if (type == TypeDegradation.PERTE)
            setMontant(100.00);
        return calculerMontant();
    }

}