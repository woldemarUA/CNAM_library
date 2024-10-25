package utilisateurs;

/**
 * Classe représentant un abonné junior.
 * Les juniors ont un abonnement spécifique avec une limite d'emprunt.
 */

public class Junior extends Abonne {

    /**
     * Constructeur pour créer un nouvel abonné junior.
     * 
     * @param id     L'identifiant unique de l'abonné junior.
     * @param nom    Le nom de l'abonné junior.
     * @param prenom Le prénom de l'abonné junior.
     * @param age    L'âge de l'abonné junior.
     */

    public Junior(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age, TypeAbonnement.JUNIOR, 2);// Limite d'emprunt pour les juniors

    }
}