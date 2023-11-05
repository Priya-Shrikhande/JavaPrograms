
package LabTask_21;
import static java.lang.Thread.sleep;
import java.util.*;
public class Que2 {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,3,8};
        Thread t1=new Thread(){
            @Override
            public void run() {
              Arrays.sort(arr);
                System.out.println("Ascending array "+Arrays.toString(arr));
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                        try{
                            sleep(100);
                            }catch(Exception e){}
               
               Arrays.sort(arr);
               for (int i = 0; i < arr.length; i++) {     
                for (int j = i+1; j < arr.length; j++) {     
                if(arr[i] < arr[j]) {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
                   }     
                }     
            }    
               System.out.println("Descending array: "+Arrays.toString(arr));
               }
            };
        t1.start();
        t2.start();
        }
}
