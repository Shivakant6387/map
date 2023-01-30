package org.example;

import java.util.HashMap;
import java.util.Map;

public class ComparingByKey {
    public static void main(String[] args) {
        Map<Integer ,String>comparingByKey=new HashMap<>();
        comparingByKey.put(100,"Rovert");
        comparingByKey.put(101,"leyli");
        comparingByKey.put(102,"Jacky");
        comparingByKey.entrySet()
                .stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
