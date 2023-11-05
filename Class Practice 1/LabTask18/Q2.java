
package LabTask18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
       Deque<Employee> d=new ArrayDeque<>();
       
       Employee e1=new Employee("pp", 23, "it");
       Employee e2=new Employee("ss", 24, "acc");
       Employee e3=new Employee("qq", 22, "entc");
       Employee e4=new Employee("rr", 20, "it");
       
       d.addFirst(e3);
       d.add(e4);
       d.add(e2);
       d.addLast(e1);
       
       
        Iterator<Employee> it=d.iterator();
         while(it.hasNext()){
             Employee em=it.next();
             System.out.println("employee name: "+em.getEmpName()+"  employee id: "+em.getId()+"  employee department: "+em.getDepartment());
       
    }
}
}
