package utilisateurs;

/**
 * Classe représentant un étudiant, qui est un type d'abonné.
 * Les étudiants ont un abonnement spécifique avec une limite d'emprunt.
 */
public class Etudiant extends Abonne {
    /**
     * Constructeur pour créer un nouvel étudiant.
     * 
     * @param id     L'identifiant unique de l'étudiant.
     * @param nom    Le nom de l'étudiant.
     * @param prenom Le prénom de l'étudiant.
     * @param age    L'âge de l'étudiant.
     */
    public Etudiant(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age, TypeAbonnement.ETUDIANT, 5); // Limite d'emprunt pour les étudiants
    }

}