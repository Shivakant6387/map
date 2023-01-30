package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(5,"Mango");
        hashMap.put(2,"Apple");
        hashMap.put(3,"Banana");
        hashMap.put(4,"Grapes");
        System.out.println("Iterator hashmap..");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
