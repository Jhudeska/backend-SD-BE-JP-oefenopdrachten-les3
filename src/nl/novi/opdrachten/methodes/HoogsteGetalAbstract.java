package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {



    public void hoogsteGetalAbstract () {

        int hoogsteGetal = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(5);
        numbers.add(50);


        for(Integer num : numbers ){

        }
//        if ( hoogsteGetal){
//            System.out.println("Het hoogste getal van de gegeven getallen is:" + hoogsteGetal);
//        }
    }
}
