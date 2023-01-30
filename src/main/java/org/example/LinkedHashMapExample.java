package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"Amit");
        lhm.put(2,"Vijay");
        lhm.put(3,"Rahul");
        for (Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
