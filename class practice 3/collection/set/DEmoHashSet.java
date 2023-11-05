
package collection.set;

import java.util.*;
import java.util.Set;

public class DEmoHashSet {
    public static void main(String[] args) {
        //Set<Integer> st=new HashSet<>();   //neither order nor sequence
      // Set<Integer> st=new LinkedHashSet<>();     //maintains sequence
        Set<Integer> st=new TreeSet<>();     //maintains order by default ascending order
        
        st.add(10);
        st.add(30);
        st.add(50);
        st.add(60);
        
        //System.out.println(st);
        for(Integer i:st){
            System.out.println(i);
        }
    }
}
