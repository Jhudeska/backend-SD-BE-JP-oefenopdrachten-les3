package nl.novi.opdrachten.sandbox;

import java.util.HashMap;
import java.util.Map;

public class Sandbox {

    public static void main(String[] secret) {

        HashMap<String, Integer> testMap =  new HashMap<>();
        testMap.put("Hello", 1);
        testMap.put("Welcome", 2);

        for (Map.Entry<String,Integer> entry : testMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//        System.out.println("Hello");
    }
}
