package nl.novi.opdrachten.sandbox;

import java.util.LinkedList;

public class LijstLinkedList {

    public static void main(String[] args){
        // Kenmerken:
        // - Snel toevoegen / verwijderen an begin/einde
        // - Langzamer bij index opvraging
        // - Kan ook als queue gebruikt worden

//        Wanneer te gebruiken
        // - veel toevoegen/verwijderen
        // - queue-achtige structuur

        // LinkedList aanmaken
        LinkedList<String> namen = new LinkedList<>();

        // Elementen toevoegen
        namen.add("Hanna");
        namen.add("Peter");
        namen.add("Lisa");
        namen.add("Ahmed");

        // Toevoegen aan begin/einde
        namen.addFirst("Start");
        namen.addLast("Einde");

        //Hele lijst tonen
        System.out.println("Lijst: " + namen);

        // Elementen ophalen
        System.out.println("Eerste naam: " + namen.get(0));

        // Eerste en laatste element ophalen
        System.out.println("Eerste: " + namen.getLast());
        System.out.println( "Laatste: "+ namen.getLast());

        // Element aanpassen
        namen.set(1, "Pieter");

        System.out.println("Na aanapassen: " + namen);

        // Element verwijderen
        namen.remove("Ahmed");

        // Eerste en laatste verwijderen
        namen.removeFirst();
        namen.removeLast();

        System.out.println("Na verwijderen: " + namen);

        // Grootte van lijst
        System.out.println("Aantal elementen: " + namen.size());

        //Controleren of element bestaat
        if(namen.contains("Lisa")){
            System.out.println("Lisa bestaat in de lijst");
        }

        // Door LinkedList lopen
        System.out.println("Alle namen: ");

        for (String naam : namen){
            System.out.println(naam);
        }

        // Lijst leegmaken
        namen.clear();

        // Checken of lijst leeg is
        System.out.println("Leeg? " + namen.isEmpty());








    }
}

