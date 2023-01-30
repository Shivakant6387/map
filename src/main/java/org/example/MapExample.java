package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(1,"Mac vogel");
        map.put(5,"Maki kato");
        map.put(2,"Revert");
        map.put(6,"Jolly");
        Set set =map.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
