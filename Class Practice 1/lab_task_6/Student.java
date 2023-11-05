
package lab_task_6;

public class Student {
    String student_name;

    public Student() {
        this.student_name = "Unknown";
    }

    public Student(String student_name) {
        this.student_name = student_name;
    }
    public String getName() {
        return student_name;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1 Name: " + student1.getName());

        Student student2 = new Student("PRIYA");
        System.out.println("Student 2 Name: " + student2.getName());

        Student student3 = new Student("SAYALI");
        System.out.println("Student 3 Name: " + student3.getName());
    }
}