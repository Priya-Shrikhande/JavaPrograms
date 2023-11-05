
package collection;

import java.util.Collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.PriorityQueue;

public class StudentCollection {
    public static void main(String[] args) {
        Vector <Student> v=new Vector<>();
        
        Student s1=new Student(102,"priya", 25);
        Student s2=new Student(101,"arush", 29);
        Student s3=new Student(104,"ramesh", 23);
        Student s4=new Student(103,"suresh", 22);
        
        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);
//        SortingByName sbn=new SortingByName();
//        Collections.sort(v, sbn);

        //Collections.sort(v);
        
        SortingByAge sba=new SortingByAge();
        Collections.sort(v, sba);
        
        Iterator<Student> it=v.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.println("id :"+s.getId()+" name :"+s.getName()+" age :"+s.getAge());
        }
    }
}
