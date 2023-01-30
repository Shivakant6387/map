package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingValue {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"David");
        map.put(2,"Leo");
        map.put(3,"Luke");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
