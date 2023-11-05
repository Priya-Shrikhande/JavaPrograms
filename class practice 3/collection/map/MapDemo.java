
package collection.map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //Map<Integer,String> mp=new HashMap<>();     
        //Map<Integer,String> mp=new LinkedHashMap<>();  //maintain sequence
        Map<Integer,String> mp=new TreeMap<>();   //maintain order
        mp.put(101, "ramesh");
        mp.put(103, "suresh");
        mp.put(102, "mahesh");
        mp.put(105, "dinesh");
        mp.put(104, "bhavesh");
        
        //System.out.println(mp);
        for(Integer i:mp.keySet()){
            String val=mp.get(i);
            System.out.println("key :"+i+" value :"+val);
        }
        
//         for(String i:mp.values()){
//            System.out.println("key :"+i );
//        }
            
    }
}
