package KarinaLes18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by IT_School on 15.11.2015.
 */
public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String,Double> tm = new TreeMap<String, Double>();
        tm.put("John", new Double (32.32));
        tm.put("Tom", new Double (31.32));
        tm.put("Ted", new Double(33.32));
        tm.put("Pit", new Double(34.32));

        //Get a Set of the entries
        Set<Map.Entry<String,Double>> set = tm.entrySet();

        //Display the Set
        for(Map.Entry<String,Double> me:set){
            System.out.println(me.getKey()+ ":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = tm.get("John");
        tm.put("John", balance + 1000);

        System.out.println("John new balance: " + tm.get("John"));
    }
}

