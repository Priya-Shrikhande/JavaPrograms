
package labTask;


public class LabTask1 {
   
    private int empId;
    private String empName;
    private double empSalary;

    public LabTask1(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public static void main(String[] args) {
        
        LabTask1 employee1 = new LabTask1(1, "PRIYA", 7000.0);
        LabTask1 employee2 = new LabTask1(2, "PURTI", 4000.0);
        LabTask1 employee3 = new LabTask1(3, "PARUL", 5000.0);
        

        LabTask1[] employeeArray = {employee1, employee2, employee3};

        
        for (LabTask1 employee : employeeArray) {
            System.out.println("Employee ID: " + employee.getEmpId() +
                               ", Name: " + employee.getEmpName() +
                               ", Salary: " + employee.getEmpSalary());
        }
    }
}


