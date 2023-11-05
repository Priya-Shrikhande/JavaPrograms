package LabTask_21;

public class Que3 extends Thread{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){  
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
            System.out.println(i);  
        }  
    }
    
    public static void main(String[] args) {
        Que3 q1=new Que3();
        Que3 q2=new Que3();
        
        q1.run();
        q2.run();
        
    }
    
    
}
