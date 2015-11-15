package KarinaLes18;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IT_School on 15.11.2015.
 */
public class Grop {
   private String name;
    private Set <Student> a = new HashSet<>();

    class Student{
        String firstName;
        String lastName;

        public Student(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
    public  void add(Student d){
        a.add(d);
        a.remove(d);
        System.out.println();
    }
}
