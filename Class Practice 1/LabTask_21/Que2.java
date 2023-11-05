//Write a Java program that sorts an array of integers using multiple threads
package LabTask_21;
import java.util.Arrays;
import java.util.Comparator;
public class Que2 extends Thread{
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
               for(int i=0;i<=arr.length/2;i++){
                   int temp = arr[i];
                   arr[i] = arr[arr.length - 1 - i];
                   arr[arr.length - 1 - i] = temp;
                }
               System.out.println("Sorted Array in Descending Order: "+Arrays.toString(arr));
               }
            };
        t1.start();
        t2.start();
        }
        
        
    }

    

