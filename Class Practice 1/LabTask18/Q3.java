
package LabTask18;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("priya");
        arr.add("parul");
        arr.add("laveena");
        arr.add("sayali");
        
        Collections.sort(arr);
        int p=Collections.binarySearch(arr, "parul");
        System.out.println(p);
    }
 }
