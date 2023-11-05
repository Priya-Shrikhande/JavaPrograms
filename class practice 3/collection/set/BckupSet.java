
package collection.set;

import java.util.*;

public class BckupSet {
    public static void main(String[] args) {
        Set<Integer> originalSet=new HashSet<>();
        
        originalSet.add(100);
        originalSet.add(200);
        originalSet.add(300);
        
        //Set<Integer> backupSet=Collections.unmodifiableSet(new HashSet<>(originalSet));    //unmodified backupdata
        Set<Integer> backupSet=new HashSet<>(originalSet);  //modifiable backup doesnot affect original
        
        System.out.println("original "+originalSet);
        System.out.println("backup "+backupSet);
        
        try{
            backupSet.add(500);
        }
        catch(Exception e){};
        
        System.out.println("original "+originalSet);
        System.out.println("backup "+backupSet);
        
        
    }
}
