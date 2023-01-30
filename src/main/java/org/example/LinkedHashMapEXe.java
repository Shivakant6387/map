package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEXe {
    public static void main(String[] args) {
        Map<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(1,"nidhi");
        lhm.put(2,"joti");
        System.out.println(lhm);
        lhm.remove(2);
        System.out.println(lhm);
    }
}
