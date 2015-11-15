package com.company;

/**
 * Created by IT_School on 14.11.2015.
 */
public class Pearson implements Comparable {
    String a;
    String b;
    int c;

    public Pearson(String a, String b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return this.a.compareTo(((Pearson)o).a);
    }
}
