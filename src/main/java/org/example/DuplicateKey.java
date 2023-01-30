package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateKey {
    public static void main(String[] args) {
        HashMap<Integer , String>hashMap=new HashMap<>();
        hashMap.put(1,"Mango");
        hashMap.put(2,"Apple");
        hashMap.put(3,"Banana");
        hashMap.put(1,"Grapes");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
