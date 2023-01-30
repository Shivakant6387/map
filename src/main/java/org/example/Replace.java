package org.example;

import java.util.HashMap;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {
        HashMap<Integer , String>hm=new HashMap<>();
        hm.put(1,"Amit");
        hm.put(2,"Sheetal");
        hm.put(3,"Vijay");
        hm.put(4,"Rahul");
        System.out.println("initial list of element");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        System.out.println("updated list of elements");
        hm.replace(2,"Gaurav");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        System.out.println("updated list of elements");
        hm.replace(1,"Vijay","Ravi");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        System.out.println("Updated list of elements");
        hm.replaceAll((k,v)->"Ajay");
        for (Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
