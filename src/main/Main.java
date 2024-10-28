package main;

import documents.*;
import gestionEmpruntsPenalites.*;
import utilisateurs.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Initialize the catalog
        Catalogue catalogue = new Catalogue();

        // Create some documents
        Livre livre1 = new Livre(1, "1984", EtatDocument.DISPONIBLE, "George Orwell", "Dystopian");
        Livre livre2 = new Livre(2, "Le Petit Prince", EtatDocument.DISPONIBLE, "Antoine de Saint-Exupéry", "Fable");
        Periodique journal = new Periodique(3, "Le Monde", EtatDocument.DISPONIBLE,
                LocalDate.now());

        // Add documents to the catalog
        catalogue.ajouterLivre(livre1);
        catalogue.ajouterLivre(livre2);

        // Display all books in the catalog
        System.out.println("Livres dans le catalogue :");
        catalogue.afficherLivres();

        // Simulate borrowing
        Emprunt emprunt1 = new Emprunt(livre1, LocalDate.now(), 7); // Borrow for 7 days
        Emprunt emprunt2 = new Emprunt(livre2, LocalDate.now().minusDays(10), 7); // Borrowed and overdue

        Employee employee1 = new Employee(1, "Woldemar", "wolyl@gmail.com", 45);
        String employeeAjout = employee1.ajouterDocument(journal);
        System.out.println((employeeAjout));

        // Check if the documents are overdue
        if (emprunt1.estEnRetard()) {
            System.out.println(livre1.getTitre() + " est en retard.");
        } else {
            System.out.println(livre1.getTitre() + " n'est pas en retard.");
        }

        if (emprunt2.estEnRetard()) {
            System.out.println(livre2.getTitre() + " est en retard.");
            Retard retard = new Retard(emprunt2);
            System.out.println("Pénalité de retard : " + retard.calculerPenalite() + " EUR");
        }

        // Simulate a degradation
        Degradation degradation = new Degradation(TypeDegradation.MAJEUR);
        System.out.println("Pénalité pour dégradation : " + degradation.calculerPenalite() + " EUR");
    }
}
