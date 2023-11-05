
package collection;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int id;

    public Student(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id= id;
    }

    @Override
    public String toString() {
        return "Student{" + "name= " + name + ", age=" + age + ", id="+id+'}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }
    
    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
    
}
