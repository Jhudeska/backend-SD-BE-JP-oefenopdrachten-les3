package nl.novi.opdrachten.sandbox;

import java.util.ArrayList;

public class LijstArrayList {

    public static void main(String[] args){
        // Kenmerken:
        // - Snel bij ophalen van get()
        // - Langzamer bij het invoegen en verwijderen middenin
        // - Meest gebruikte lijst

//        Wanneer te gebruiken
        // - veel lezen/ophalen
        // - weinig inserts/verwijderen middenin

        ArrayList<String> namen = new ArrayList();

        namen.add("Jan");
        namen.add("Piet");
        namen.add("Klaas");
        namen.add("Anna");

        System.out.println(namen.get(0));
        System.out.println(namen.getFirst());
        System.out.println(namen.getLast());
        System.out.println(namen.getClass()); // show java class it  uses
    }
}
