package utilisateurs;

import documents.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite représentant un utilisateur du système.
 * Elle contient les attributs et les méthodes communs à tous les types
 * d'utilisateurs.
 */

public abstract class Utilisateur {
    int id;
    String nom;
    String prenom;
    int age;
    List<Document> borrowedList;

    /**
     * Constructeur pour créer un nouvel utilisateur.
     * 
     * @param id     L'identifiant unique de l'utilisateur.
     * @param nom    Le nom de l'utilisateur.
     * @param prenom Le prénom de l'utilisateur.
     * @param age    L'âge de l'utilisateur (doit être supérieur ou égal à 0).
     */

    public Utilisateur(int id, String nom, String prenom, int age) {

        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        setAge(age);
        this.borrowedList = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomComplete() {
        return this.nom + " " + this.prenom;
    }

    public int getAge() {
        return this.age;
    }

    /**
     * Définit l'âge de l'utilisateur.
     * 
     * @param age L'âge à définir (doit être supérieur ou égal à 0).
     * @throws IllegalArgumentException Si l'âge est négatif.
     */

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L `age ne peut pas etre negatif.");
        }
        this.age = age;
    }

    /**
     * Méthode abstraite permettant à un utilisateur d'emprunter un document.
     * 
     * @param d Le document à emprunter.
     */

    public abstract void emprunter(Document d);

    /**
     * Méthode permettant de rendre un document emprunté.
     * 
     * @param d Le document à rendre.
     */

    public void rendre(Document d) {
        if (borrowedList.remove(d)) {
            System.out.println("Document " + d.getTitre() + " était rendu par utilisateur: " + getNomComplete());
        } else {
            System.out.println("Document " + d.getTitre()
                    + " n'est pas dans la liste d'emprunt de l'utilisateur: AJOUTE UTILISATEUR"
                    + getNomComplete());
        }
    }

    @Override
    public String toString() {
        return "Utilisateur {" + "id=" + id + ", nom='" + nom + "', prenom='" + prenom + "', age=" + age + "}";
    }
}