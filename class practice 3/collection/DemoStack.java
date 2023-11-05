
package collection;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Student> st=new Stack<>();
        
        Student s1=new Student(101,"priya", 25);
        Student s2=new Student(102,"purti", 29);
        Student s3=new Student(103,"ramesh", 23);
        Student s4=new Student(104,"suresh", 22);
        
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        
        Iterator<Student> it=st.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.println("name :"+s.getName()+"  age :"+s.getAge());
        }
    }
}
