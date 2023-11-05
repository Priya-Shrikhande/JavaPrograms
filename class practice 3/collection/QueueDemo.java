
package collection;
import java.util.PriorityQueue;
public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<>();
        q.add("ramesh");
        q.add("suresh");
        q.add("dinesh");
        q.add("mahesh");
        q.add("bhavesh");
        
        
        
        System.out.println(q);
        
        String s=q.poll();
        System.out.println(s);
        System.out.println(q);
        
        String s1=q.poll();
        System.out.println(s1);
        System.out.println(q);
        
        String s2=q.poll();
        System.out.println(s2);
        System.out.println(q);
        
        String s3=q.poll();
        System.out.println(s3);
        System.out.println(q);
        
        String s4=q.poll();
        System.out.println(s4);
        System.out.println(q);
    }
    
}
