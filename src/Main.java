import documents.Livre;
import documents.Magazine;

public class Main {
    public static void main(String[] args) {

        Livre livre1 = new Livre("Bible", "Inconnu", -3300, 1000);
        Magazine magazine1 = new Magazine("Le monde", "La France", 1986, 145);

        livre1.afficherDetails();
        magazine1.afficherDetails();
    }
}