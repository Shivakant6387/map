package org.example;

import java.util.HashMap;

public class HashMapRemove {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Amit");
        hm.put(2,"Vijay");
        hm.put(3,"Rahul");
        hm.put(4,"Gaurav");
        System.out.println(hm);
        hm.remove(1);
        System.out.println(hm);
        hm.remove(2,"Vijay");
        System.out.println(hm);
    }
}
