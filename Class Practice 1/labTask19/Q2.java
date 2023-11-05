
package labTask19;

import java.util.*;

public class Q2 {
  public static void main(String[] args) {
        Map<String,Integer> SdtGrade=new HashMap<>();
        Integer sum=0;
        Integer avg=0;
        SdtGrade.put("ramesh",40);
        SdtGrade.put("suresh",60);
        SdtGrade.put("dinesh",50);
        SdtGrade.put("mahesh",80);
        
        System.out.println(SdtGrade);
        
        SdtGrade.remove("suresh");
        System.out.println(SdtGrade);
        
        for(Integer i:SdtGrade.values()){
            System.out.println("grades :"+i);
        }

         for(String i:SdtGrade.keySet()){
            Integer val=SdtGrade.get(i);
            System.out.println("student name :"+i+" grade :"+val);
        }
        
        for(Integer i:SdtGrade.values()){
           sum=i+sum;
           avg=sum/3;
           }
        System.out.println("average : "+avg);
    }
}
