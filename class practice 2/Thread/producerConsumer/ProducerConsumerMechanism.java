package Thread.producerConsumer;

import java.time.Duration;
import java.util.*;

class Producer implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Producer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    public void produce(int i) throws InterruptedException{
        if(buffer.size()==SIZE){
            synchronized (buffer) {
            System.out.println("buffer is full and waiting to consume items "+buffer.size());
            buffer.wait(); //blocked production
        }
        }
        synchronized (buffer) {
        buffer.add(i);
        buffer.notifyAll();  //unblocked consumer
        }
    }
    @Override
    public void run() {
       for(int i=1;i<10;i++){
           try{
           produce(i);
           }catch(Exception e){}
           System.out.println("produced item "+i);
        }
    }
    
}
class Consumer implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Consumer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    public int consume() throws InterruptedException{
        if(buffer.isEmpty()){
            synchronized (buffer) {
            System.out.println("buffer is empty and waiting to produce items "+buffer.size());
            buffer.wait(); //blocked consumption
            }
        }
        synchronized (buffer) {
        buffer.notifyAll();  //unblocked producer
        return (Integer)buffer.remove(0);
        }
    }
    
    @Override
    public void run() {
        while(true){
            try{
            System.out.println("consumed item "+consume());
            Thread.sleep(100);
            }catch(Exception e){}
        }
        
    }
    
}
public class ProducerConsumerMechanism {
    
    public static void main(String[] args) {
        Vector buff=new Vector();
        int size=5;
        Producer prod=new Producer(buff, size);
        Consumer cons=new Consumer(buff, size);
        
        Thread t1=new Thread(prod);
        Thread t2=new Thread(cons);
        
        t1.start();
        t2.start();
    }
}
