
package LabTask18;
import java.util.*;

public class EmpComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
    
}
