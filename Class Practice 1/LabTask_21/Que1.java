
package LabTask_21;

public class Que1 {
    
    public static void main(String[] args) {
        int n=20;
        Thread t1=new Thread(){
            @Override
            public void run() {
                synchronized (this) {
                for(int i=1;i<=n;i++){
                    if(i%2==0){
                        System.out.println("even no: "+i);
                    }
                }
            } 
        }
        };
        
        Thread t2=new Thread(){
            @Override
            public void run() {
            synchronized (this) {
                for(int i=1;i<=n;i++){
                    if(i%2!=0){
                        try{
                            sleep(100);
                            }catch(Exception e){}
                        System.out.println("odd no: "+i);
                    }
                }
            } 
          }
        };
        
        t1.start();
        t2.start();
    }
}
