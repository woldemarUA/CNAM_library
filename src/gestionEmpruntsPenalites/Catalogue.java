package gestionEmpruntsPenalites;

import java.util.ArrayList;

import documents.Livre;

/**
 * La classe Catalogue gère la liste des livres dans la bibliothèque.
 */

public class Catalogue {
    ArrayList<Livre> livres; // Liste des livres disponible dans le catalogue

    // Constructeur par défaut qui initialise une liste vide de livres
    public Catalogue() {
        this.livres = new ArrayList<>();
    }

    // Constructeur qui initialise le catalogue avec une liste de livres existante
    public Catalogue(ArrayList<Livre> livres) {
        this.livres = new ArrayList<>(livres);
    }

    // Ajoute un livre au catalogue
    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    // Supprime un livre du catalogue
    public void effacerLivre(Livre livre) {
        livres.remove(livre);
    }

    // Affiche tous les livres présents dans le catalogue
    public void afficherLivres() {
        livres.stream().forEach(System.out::println);
    }

}