
package LabTask18;

public class Employee implements Comparable<Employee>{
    private String empName;
    private int id;
    private String department;

    public Employee(String empName, int id, String department) {
        this.empName = empName;
        this.id = id;
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    
    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
    
}
