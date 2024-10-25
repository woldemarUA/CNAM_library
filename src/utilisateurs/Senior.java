package utilisateurs;

/**
 * Classe représentant un abonné senior.
 * Les seniors ont un abonnement spécifique avec une limite d'emprunt
 * différente.
 */

public class Senior extends Abonne {

    /**
     * Constructeur pour créer un nouvel abonné senior.
     * 
     * @param id     L'identifiant unique de l'abonné senior.
     * @param nom    Le nom de l'abonné senior.
     * @param prenom Le prénom de l'abonné senior.
     * @param age    L'âge de l'abonné senior.
     */

    public Senior(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age, TypeAbonnement.SENIOR, 3);// Limite d'emprunt pour les seniors
    }
}