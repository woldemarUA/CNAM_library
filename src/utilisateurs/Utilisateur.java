package utilisateurs;

import documents.Document;

import java.util.ArrayList;
import java.util.List;

public abstract class Utilisateur {
    int id;
    String nom;
    String prenom;
    int age;
    List<Document> borrowedList;

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

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L `age ne peut pas etre negatif.");
        }
        this.age = age;
    }

    public void emprunter(Document d) {
    }

    public void rendre(Document d) {
    }

    @Override
    public String toString() {
        return "Utilisateur {" + "id=" + id + ", nom='" + nom + "', prenom='" + prenom + "', age=" + age + "}";
    }
}