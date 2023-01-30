package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer , String>map=new HashMap<>();
        map.put(100,"Jackson");
        map.put(101,"Ethan");
        map.put(102,"Logan");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}