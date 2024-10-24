package documents;

public class Livre extends Document {
    int nombrePages;

    public Livre(String titre, String auteur, int anneePublication, int nombrePages) {
        super(titre, auteur, anneePublication);
        this.nombrePages = nombrePages;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Quantite de pages: " + nombrePages);
    }

}
