
package collection.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrency {
    public static void main(String[] args) {
        //HashMap<Integer,String> mp=new HashMap<>();
        ConcurrentHashMap<Integer,String> mp=new ConcurrentHashMap<>();
        
        mp.put(101,"ramesh");
        mp.put(102,"dinesh");
        mp.put(103,"suresh");
        
        Runnable task=() -> {
        for(int i=104;i<=106;i++){
            mp.put(i, "value" +i);
        }
        };
        
        Thread th1=new Thread(task);
        Thread th2=new Thread(task);
        
        
        th1.start();
        th2.start();
        
        System.out.println(mp);
    }
}
