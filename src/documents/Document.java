package documents;

public class Document {
    String titre;
    String auteur;
    int anneePublication;

    public Document(String titre, String auteur, int anneePublication) {

        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public void afficherDetails() {
        System.out.println("Le titre est: " + titre);
        System.out.println("L\'auteur est: " + auteur);
        System.out.println("L'annee de la publication est: " + anneePublication);
    }

}