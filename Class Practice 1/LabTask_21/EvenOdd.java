//Write a Java program that creates two threads to find and print even and odd numbers from 1
//to 20

package LabTask_21;

import static java.lang.Thread.sleep;



public class EvenOdd implements Runnable{
    
     int n=20;
    @Override
    public void run() {
        synchronized (this) {
           
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.println("even no: "+i);
                }
                else{
                    try{
                            sleep(100);
                            }catch(Exception e){}
                    System.out.println("odd no: "+i);
                }
            }
      
        }
    }
   
    public static void main(String[] args) {
        EvenOdd eo1=new EvenOdd();
        //EvenOdd eo2=new EvenOdd();
        
        Thread t1=new Thread(eo1);
        //Thread t2=new Thread(eo2);
        
             t1.start();
            //t2.start();
    }
}
