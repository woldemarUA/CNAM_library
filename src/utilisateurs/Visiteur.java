package utilisateurs;

import documents.Document;

/**
 * Classe représentant un visiteur du système.
 * Le visiteur ne peut pas emprunter des documents, mais peut consulter des
 * résumés.
 */

public class Visiteur extends Utilisateur implements Resumable {

    /**
     * Constructeur pour créer un nouveau visiteur.
     * 
     * @param id     L'identifiant unique du visiteur.
     * @param nom    Le nom du visiteur.
     * @param prenom Le prénom du visiteur.
     * @param age    L'âge du visiteur.
     */

    public Visiteur(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age);

    }

    /**
     * Essaie d'emprunter un document. Les visiteurs ne peuvent pas emprunter des
     * documents.
     * 
     * @param d Le document que le visiteur essaie d'emprunter.
     */

    @Override
    public void emprunter(Document d) {
        System.out.println(getNomComplete() + " est visiteur et n'a pas les droits à emprunter");
    }

    /**
     * Essaie de rendre un document. Les visiteurs ne peuvent pas rendre des
     * documents.
     * 
     * @param d Le document que le visiteur essaie de rendre.
     */

    @Override
    public void rendre(Document d) {
        System.out.println(getNomComplete() + " est visiteur et ne peut pas à rendre");
    }

    /**
     * Résume un document.
     * 
     * @param d Le document à résumer.
     */

    public void resumer(Document d) {

        System.out.println(getNomComplete() + " a résumé de lire le document: " + d.getTitre());
    }

    @Override
    public String toString() {
        return super.toString() + " type=visiteur }";
    }

}