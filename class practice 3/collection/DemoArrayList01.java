package collection;

import java.util.*;

public class DemoArrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(26);
        lst.add(89);
        lst.add(13);
        
        Collections.sort(lst);
//        int p=Collections.binarySearch(lst, 13);
//        System.out.println("position "+p);
        
boolean b=Collections.disjoint(lst, Arrays.asList(23,200,300));
        System.out.println(b);
        
        
//        
//        Collections.copy(lst, Arrays.asList(100,200,300));
       
        List<Integer> lst1=Arrays.asList(34,45,67);
        
        List<String> lst2=Arrays.asList("ramesh","suresh","bhavesh");
        
       
        Collections.sort(lst2);
        for(String i:lst2)
            System.out.println(i);
    }
}
