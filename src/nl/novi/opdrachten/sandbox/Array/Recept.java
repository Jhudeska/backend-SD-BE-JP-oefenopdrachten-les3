package nl.novi.opdrachten.sandbox.Array;

import java.util.ArrayList;

class Recept {
    private String naam;
    private Persoon auteur; //Composition
    private ArrayList<String> ingredienten;
    private ArrayList<Review> reviews;

    public Recept(String naam, Persoon auteur){
        this.naam = naam;
        this.auteur = auteur;

        //ArrayLists
        ingredienten = new ArrayList<>();
        reviews = new ArrayList<>();
    }

    // Ingrediënt toevoegen
    public void voegIngredientToe(String ingredient) {
        ingredienten.add(ingredient);
    }

    // Review toevoegen
    public void voegReviewToe(Review review) {
        reviews.add(review);
    }

    // Recept tonen
    public void toonRecept() {
        System.out.println("=== RECEPT ===");
        System.out.println("Naam  : " + naam);
        System.out.println("Auteur : " + auteur);

        System.out.println("\nIngredienten: ");
            for (String i : ingredienten){
                System.out.println("- " + i);
            }

        System.out.println("\nReviews ");
            for (Review r : reviews){
                r.toonReview();
            }
    }



}