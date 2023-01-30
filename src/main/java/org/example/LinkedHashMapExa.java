package org.example;

import java.util.LinkedHashMap;

public class LinkedHashMapExa {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1,"Anjali");
        lhm.put(2,"Amrita");
        lhm.put(3,"Sakshi");
        System.out.println("Key"+lhm.keySet());
        System.out.println("value"+lhm.values());
        System.out.println("key value pairs"+lhm.entrySet());
    }
}