package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExampleGeneric {
    public static void main(String[] args) {
        Map<Integer , String >genericMap=new HashMap<>();
        genericMap.put(100,"Jolly");
        genericMap.put(101,"Mali");
        genericMap.put(102,"Loise");
        for (Map.Entry m:genericMap.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
