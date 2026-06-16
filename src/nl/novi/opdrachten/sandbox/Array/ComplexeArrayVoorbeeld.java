package nl.novi.opdrachten.sandbox.Array;

import java.util.Arrays;

public class ComplexeArrayVoorbeeld {

    public static void main(String[] args){

        // 2D-array: cijfers van studenten voor meerdere vakken
        String[] studenten = {"Jan", "Lisa", "Ahmed"};

        int [][] cijfers = {
                {8, 7, 9}, // Jan
                {6, 9, 8}, // Lisa
                {7, 8, 10} // Ahmed
        };

        String[] vakken = {"Java", "Database", "Webdev"};

        // Alle gegevens tonen
        for (int i = 0; i < studenten.length; i++){
            System.out.println("Student: " + studenten[i]);

            int totaal = 0;
            int hoogste = cijfers[i][0];
            int laagste = cijfers[i][0];

            for (int j = 0; j < cijfers[i].length; j++){

                int cijfer = cijfers[i][j];

                System.out.println(
                        "Vak: " + vakken[j] +
                        " | Cijfer: " + cijfer
                );

                totaal += cijfer;

                // Hoogste cijfer zoeken
                if(cijfer > hoogste){
                    hoogste = cijfer;
                }

                //Lijste cijfer zoeken
                if(cijfer < laagste){
                    laagste = cijfer;
                }

                //gemiddelde berekenen
                double gemiddelde =
                        (double) totaal / cijfers[i].length;

                System.out.println("Gemiddelde: " + gemiddelde);
                System.out.println("Hoogste: " + hoogste);
                System.out.println("Laagste: " + laagste);

                // Student geslaagd?
                if(gemiddelde >= 7){
                    System.out.println("Status: Geslaagd");
                }else {
                    System.out.println("Status: Gezakt");
                }

                System.out.println("--------------------");

            }


            //Array sorteren
            int[] punten = {45, 12, 99, 34, 67};

            Arrays.sort(punten);

            System.out.println("Gesorteerde punten:");
            System.out.println(Arrays.toString(punten));

            // Zoeken in array
            int zoekWaarde = 67;
            boolean gevonden = false;

            for (int punt : punten){
                if(punt == zoekWaarde){
                    gevonden = true;
                    break;
                }
            }

            if(gevonden){
                System.out.println( zoekWaarde + "gevonden!");
            }else {
                System.out.println( zoekWaarde + " niet gevonden!");
            }

        }


    }
}
