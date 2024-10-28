package utilisateurs;

import documents.Document;

import documents.EtatDocument;
import gestionEmpruntsPenalites.Catalogue;

/**
 * Classe représentant un employé du système.
 * Les employés peuvent gérer les documents (ajouter et emprunter des
 * documents).
 */

public class Employee extends Utilisateur {

    /**
     * Constructeur pour créer un nouvel employé.
     * 
     * @param id     L'identifiant unique de l'employé.
     * @param nom    Le nom de l'employé.
     * @param prenom Le prénom de l'employé.
     * @param age    L'âge de l'employé.
     */

    public Employee(int id, String nom, String prenom, int age) {
        super(id, nom, prenom, age);
    }

    /**
     * Ajoute un document au système.
     * 
     * @param d Le document à ajouter.
     * @return Un message de confirmation indiquant que le document a été ajouté
     *         avec succès.
     */

    public String ajouterDocument(Document d) {

        return "Document " + d.toString() + " était ajouté à catalogue avec success";
    }

    /**
     * Emprunte un document si celui-ci est disponible.
     * 
     * @param d Le document à emprunter.
     * @throws IllegalArgumentException Si le document n'est pas disponible.
     */

    @Override
    public void emprunter(Document d) {
        if (d.getEtat() == EtatDocument.DISPONIBLE) {
            borrowedList.add(d);
            d.changerEtat(EtatDocument.EMPRUNTE);
            System.out.println("Document: " + d.getTitre() + " était emprunté à utilisateur: ADD USER LATER");
        } else {
            System.out.println("Document " + d.getTitre() + " n'est pas disponible pour l'emprunt.");
        }

    }

    @Override
    public String toString() {
        return super.toString() + " type=employee }";
    }

}