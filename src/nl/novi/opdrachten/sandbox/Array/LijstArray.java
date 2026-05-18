package nl.novi.opdrachten.sandbox.Array;


public class LijstArray {

    public static void main(String[] args){
        //Array aanmaken
        int[] getallen = {10, 20, 30, 40, 50};

        //Elementen ophalen
        System.out.println("Eerste element: " + getallen[0]);

        //Element wijzigen
        getallen[2] = 99;
        System.out.println("Derde element gewijzigd naar: " + getallen[2]);

        // Lengte van array
        System.out.println("Lengte van array: " + getallen.length);

        //Loop door array
        System.out.println("Alle elementen");
        for(int i = 0; i < getallen.length; i++){
            System.out.println(getallen[i]);
        }

        //Enhanced for-loop
        System.out.println("Met enhanced for -loop");
        for (int getal : getallen){
            System.out.println(getal);
        }

        //Som berekenen
        int som = 0;

        for (int nummer : getallen){
            som += nummer;
        }

        System.out.println("Som: " + som);
    }
}
