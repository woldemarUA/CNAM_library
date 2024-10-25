package utilisateurs;

import documents.Document;

/**
 * Interface pour les classes qui peuvent résumer des documents.
 */
public interface Resumable {
    /**
     * Résume le document spécifié.
     * 
     * @param d Le document à résumer.
     */
    void resumer(Document d);
}