//Write a java program to Create a menu-driven interface for managing
//student grades. Users can perform the following tasks:
//1. Add students
//2. Update grades
//3. Remove students
//4. View individual grades
//5. List all students and grades
//6. Calculate the average grade for all students.
//Use HashMap to store student names and grades.

package labTask19;

import java.util.*;

public class Que2 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        Map<String,Integer> SdtGrade=new HashMap<>();
        public void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1.Add students");
        System.out.println("2.Update grades");
        System.out.println("3.Remove students");
        System.out.println("4.View individual grades");
        System.out.println("5.List all students and grades");
        System.out.println("6.Calculate the average grade for all students.");
        System.out.println("7.exit");
       }
        
        int choice=sc.nextInt();
        String name = null;
        int grade = 0;
        
        switch(choice){
            case 1:
                System.out.println("Enter name and grade of 5 students:");
                for(int j=1;j<=5;j++){
                SdtGrade.put(name=sc.next(), grade=sc.nextInt());
                }
                for(String i:SdtGrade.keySet()){
                    Integer val=SdtGrade.get(i);
                    System.out.println("student name :"+i+"   grade :"+val);
                    }
                q.menu();
                
                break;
                
                case 2:
                int g=sc.nextInt();
                SdtGrade.replace(name, grade, g);
                for(String i:SdtGrade.keySet()){
                    Integer val=SdtGrade.get(i);
                    System.out.println("student name :"+i+"   grade :"+val);
                    }
               
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            default:
                
                
        }
    }
}
