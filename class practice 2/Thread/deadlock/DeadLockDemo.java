
package Thread.deadlock;

import static java.lang.Thread.sleep;

public class DeadLockDemo {
    public static void main(String[] args) {
        String rec1="aman";
        String rec2="suman";
        
        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (rec1) {
                System.out.println("thread 1 uses resource 1 "+rec1);
                try{
                    sleep(100);
                }catch(Exception e){}
                }
                synchronized (rec2) {
                System.out.println("thread 1 require resource 2 "+rec2);
                }
            }
            
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                synchronized (rec1) {
                System.out.println("thread 2 uses resource 2 "+rec2);
                try{
                    sleep(100);
                }catch(Exception e){}
                }
                synchronized (rec2) {
                System.out.println("thread 2 require resource 1 "+rec1);
                }
            }
            
        };
        t1.start();
        t2.start();
    }
}
