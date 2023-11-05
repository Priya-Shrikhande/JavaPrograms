
package Assignment_1;

class Exam {
    private String examCentre;
    public Exam(String examentre) {
        this.examCentre = examCentre;
    }
    public void printExamCentre() {
        System.out.println("Exam Centre is : " + examCentre );
    }
}


class Student {
    private String name;
    private int roll_no;
    Exam EC;
    public Student(String name, int roll_no,Exam ExamCentre) {
        this.name = name;
        this.roll_no = this.roll_no;
        this.EC =ExamCentre;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("roll number: " + roll_no);
        EC.printExamCentre();
    }
}
public class Question1 {
    public static void main(String[] args) {
          Exam E = new Exam("nagpur");
        Student s = new Student("priya", 20, E);
        System.out.println("Exam Information:");
        s.displayInfo();
    }
}
