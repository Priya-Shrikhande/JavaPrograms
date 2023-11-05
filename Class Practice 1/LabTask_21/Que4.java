//Write a Java program that calculates the sum of all prime numbers up to a given limit using
//multiple threads.

package LabTask_21;

import java.util.Scanner;

public class Que4 implements Runnable{
    int n=100;
    int c=0;
    @Override
    public void run() {
        
    }
    public static void main(String[] args) {
        Que4 q1=new Que4();
        Que4 q2=new Que4();
        Que4 q3=new Que4();
        
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        
        Thread t1=new Thread(q1);
        Thread t2=new Thread(q2);
        Thread t3=new Thread(q3);
        
        t1.start();
//        t2.start();
//        t3.start();
    }

    
}
