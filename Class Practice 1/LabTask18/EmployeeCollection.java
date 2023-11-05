
package LabTask18;


import java.util.*;
import java.util.Stack;
import java.util.Vector;

public class EmployeeCollection {
    public static void main(String[] args) {
         Vector<Employee> e=new Stack<>();
         
         Employee e1=new Employee("priya", 105,"IT");
         Employee e2=new Employee("sayli", 101,"IT");
         Employee e3=new Employee("laveena", 103,"entc");
         Employee e4=new Employee("ayush", 106,"electrical");
         Employee e5=new Employee("bhavesh", 102,"mech");
         Employee e6=new Employee("mayuri", 104,"account");
         
         e.add(e1);
         e.add(e2);
         e.add(e3);
         e.add(e4);
         e.add(e5);
         e.add(e6);
         
         //Collections.sort(e);
         
         EmpComparator c=new EmpComparator();
         Collections.sort(e, c);
         
         Iterator<Employee> it=e.iterator();
         while(it.hasNext()){
             Employee em=it.next();
             System.out.println("employee name: "+em.getEmpName()+"  employee id: "+em.getId()+"  employee department: "+em.getDepartment());
         }
    }
}
