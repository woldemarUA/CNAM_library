package documents;

public class Magazine extends Document {
    int numeroEdition;

    public Magazine(String titre, String auteur, int anneePublication, int numeroEdition) {
        super(titre, auteur, anneePublication);
        this.numeroEdition = numeroEdition;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Numero d\'edition: " + numeroEdition);
    }
}
