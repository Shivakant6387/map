package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingByKeyDescendingOrder {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Jason");
        map.put(2,"Maki");
        map.put(3,"Jack");
        map.put(4,"Henry");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
