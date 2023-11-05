
package has.a.relationship;

class College{
    private String name;
    private Department departs[];
    
    public College(String name,Department[] departs){
        this.name=name;
        this.departs=departs;
    }
    void collegeDetails(){
        System.out.println("College Details");
        System.out.println("Name : "+name);
        for(Department d:departs)
            System.out.println(d);
    }
}
 class Department {
     private String name;
     private int capacity;
     
     public Department(String name,int capacity){
         this.name=name;
         this.capacity=capacity;
     }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", capacity=" + capacity + '}';
    } 
 }
public class TestAggregation {
    public static void main(String[] args) {
        Department dept[]={new Department("IT", 500),new Department("Mechanical", 300),new Department("chemical", 200),new Department("Electronics", 100)};
        Department dept1[]={new Department("IT", 500),new Department("Mechanical", 300),new Department("Electronics", 100)};
        College c=new College("YCCE", dept);
        College c1=new College("VNIT", dept1);
        
        c.collegeDetails();
        System.out.println("*****************************************************************");
        c1.collegeDetails();
    }
}
    
