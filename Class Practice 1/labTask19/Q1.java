
package labTask19;

import java.util.HashMap;
import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Map<String,Integer>populationMap=new HashMap<>();
        
        populationMap.put("nagpur",500000);
        populationMap.put("pune",600000);
        populationMap.put("mumbai",700000);
        populationMap.put("nashik",400000);
        populationMap.put("akola",300000);
        populationMap.put("delhi",500000);
        
        for(String i:populationMap.keySet()){
            Integer val=populationMap.get(i);
            System.out.println("city :"+i+" population :"+val);
        }
        
        System.out.println("***************");
        int j=populationMap.get("nagpur");
        System.out.println("nagpur has population "+j);
        
        System.out.println("****************");
        boolean b=populationMap.remove("pune", 600000);
        System.out.println("pune city removed or not : "+b);
        
        System.out.println("*****************");
        boolean p=populationMap.containsKey("pune");
        System.out.println("pune city exist or not :"+p);
        
        System.out.println("****************");
        System.out.println(populationMap);
    }
}
