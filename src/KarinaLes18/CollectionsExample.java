package KarinaLes18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by IT_School on 15.11.2015.
 */
public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "green", "blue");

        Collections.sort(list1);
        System.out.println(list1);

        List<String>list2 =  Arrays.asList("green", "red", "yellow", "blue");

        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.shuffle(list2);
        System.out.println(list2);

        Collections.fill(list1, "black");
        System.out.println(list1);

        System.out.println(Collections.max(list2));
        System.out.println(Collections.min(list2));

        System.out.println(Collections.frequency(list2, "red"));


        //Collections.singleton()
    }
}
