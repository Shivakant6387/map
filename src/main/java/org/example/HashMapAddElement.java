package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddElement {
    public static void main(String[] args) {
        HashMap<Integer , String>hashMap=new HashMap<>();
        hashMap.put(1,"Amit");
        hashMap.put(2,"Vinay");
        hashMap.put(3,"Rahul");
        System.out.println("After invoking put method ");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        hashMap.putIfAbsent(4,"Amrita");
        System.out.println("After invoking all put absent method");
        for (Map.Entry m:hashMap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(5,"Anjali");
        hm.putAll(hashMap);
        System.out.println("After invoking putAll method");
        for (Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
