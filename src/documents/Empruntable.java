package documents;

/**
 * Interface pour les documents qui peuvent être empruntés.
 */
public interface Empruntable {
    /**
     * Vérifie si le document est disponible pour emprunt.
     * 
     * @return true si le document est disponible, false sinon.
     */
    boolean estDisponible();

    /**
     * Change l'état du document pour refléter qu'il a été emprunté.
     */
    void emprunter();

    /**
     * Change l'état du document pour refléter qu'il a été rendu.
     */
    void rendre();
}
