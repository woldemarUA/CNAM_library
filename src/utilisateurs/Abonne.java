package utilisateurs;

import documents.Document;

/**
 * Classe mère pour les abonnés avec différents types d'abonnements.
 */

public class Abonne extends Utilisateur {
    TypeAbonnement abonnementType;

    protected int empruntLimit;

    /**
     * Constructeur pour créer un nouvel abonné.
     * 
     * @param id             L'identifiant unique de l'abonné.
     * @param nom            Le nom de l'abonné.
     * @param prenom         Le prénom de l'abonné.
     * @param age            L'âge de l'abonné.
     * @param abonnementType Le type d'abonnement de l'abonné.
     * @param empruntLimit   La limite d'emprunts de l'abonné.
     */

    public Abonne(int id, String nom, String prenom, int age, TypeAbonnement abonnementType, int empruntLimit) {
        super(id, nom, prenom, age);
        this.abonnementType = abonnementType;
        this.empruntLimit = empruntLimit;
    }

    public int getEmpruntLimit() {
        return empruntLimit;
    }

    public TypeAbonnement getAbonnementType() {
        return abonnementType;
    }

    public void setAbonnementType(TypeAbonnement abonnementType) {
        this.abonnementType = abonnementType;
    }

    /**
     * Emprunte un document en vérifiant si la limite d'emprunts est atteinte.
     * 
     * @param d Le document à emprunter.
     * @throws IllegalArgumentException Si la limite d'emprunts est atteinte.
     */

    @Override
    public void emprunter(Document d) {
        if (borrowedList.size() >= empruntLimit) {
            throw new IllegalArgumentException(
                    getNomComplete() + " atteint le limit d'emprunts. Son limit est :" + empruntLimit);
        } else {
            borrowedList.add(d);
            System.out.println("Document: " + d.getTitre() + " était emprunté à utilisateur: " + getNomComplete()
                    + ". Cet utilisateur pourrais encrore emprunter: " + (borrowedList.size() - empruntLimit)
                    + " documents");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", abonnementType=" + abonnementType + ", empruntLimit=" + empruntLimit + " }";
    }
}
