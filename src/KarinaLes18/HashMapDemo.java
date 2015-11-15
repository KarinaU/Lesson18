package KarinaLes18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by IT_School on 15.11.2015.
 */
public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Double> hm = new HashMap<String, Double>();
        hm.put("John", new Double (32.32));
        hm.put("Tom", new Double (31.32));
        hm.put("Ted", new Double (33.32));
        hm.put("Pit", new Double (34.32));

        //Get a Set of the entries
        Set<Map.Entry<String,Double>> set = hm.entrySet();

        //Display the Set
        for(Map.Entry<String,Double> me:set){
            System.out.println(me.getKey()+ ":");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("John");
        hm.put("John", balance + 1000);

        System.out.println("John new balance: " + hm.get("John"));
    }
}
