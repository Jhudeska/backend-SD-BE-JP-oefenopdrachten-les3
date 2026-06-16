package nl.novi.opdrachten.sandbox.Array.Recept;

public class Main {

    public static void main (String[] args){

        // Personen maken
        Persoon persoon1 = new Persoon("Jan", 25);
        Persoon persoon2 = new Persoon("Emma", 30);
        Persoon persoon3 = new Persoon("Ali", 22 );

        // Recept maken
        Recept pasta = new Recept("Spaghetti Carbonara", persoon1);

        // Ingredienten toevoegen
        pasta.voegIngredientToe("Spaghetti");
        pasta.voegIngredientToe("Eieren");
        pasta.voegIngredientToe("Spek");
        pasta.voegIngredientToe("Parmezaanse kaas");

        // Reviews maken
        Review review1 = new Review(persoon2, 9, "Heel lekker recept!");
        Review review2 = new Review(persoon3, 8, "Makkelijk en snel");

        // Reviews toevoegen aan recept
        pasta.voegReviewToe(review1);
        pasta.voegReviewToe(review2);

        // Alles tonen
        pasta.toonRecept();
    }
}
