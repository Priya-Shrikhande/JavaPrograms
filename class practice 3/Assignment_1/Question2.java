//Write a program in java to create a class name studinfo accept the student
//information by the member method getdata and inherit it in the base class name marks create
//method to get marks in derived class and calculate the percentage and display the complete
//information of student do this for three students.

package Assignment_1;

import java.util.Scanner;

class StudInfo {
     String name;
     int rollNumber;
     int age;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter roll number: ");
        rollNumber = sc.nextInt();
        System.out.println("Enter age: ");
        age = sc.nextInt();
    }
}

class Marks extends StudInfo {
    float phy;
    float chem;
    float bio;

    public void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in physics: ");
        phy = sc.nextFloat();
        System.out.println("Enter marks in chemistry: ");
        chem =sc.nextFloat();
        System.out.println("Enter marks in biology: ");
        bio =sc.nextFloat();
    }

    public void calculatePer() {
        double totalMarks = phy + chem + bio;
        double percentage = (totalMarks / 300) * 100;
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("age: " + age);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("----------------------------------------------");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Marks[] students = new Marks[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter information for Student " + (i + 1) + ":");
            students[i] = new Marks();
            students[i].getData();
            students[i].getMarks();
        }
        System.out.println("******************************************************");
        for (int i = 0; i < 3; i++) {
            students[i].calculatePer();
        }
    }
}
