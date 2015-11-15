package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Pearson> as= new ArrayList<>();
        as.add( new Pearson("Bacz","fjhklh",35));
        as.add( new Pearson("Bacz","fjhklh",32));
        as.add(new Pearson("Bacz", "fjhklh", 34));
        System.out.println(as);


        Set<Pearson> at= new TreeSet<>();
        at.add( new Pearson("Bacz","fjhklh",35));
        at.add( new Pearson("Bacz","fjhklh",32));
        at.add( new Pearson("Bacz","fjhklh",34));
        System.out.println(at);
    }









}
