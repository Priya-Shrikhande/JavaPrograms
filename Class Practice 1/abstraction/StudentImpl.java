
package abstraction;

public class StudentImpl implements StudentInter{

    @Override
    public void showName(String name) {
        System.out.println(" name is "+name);
    }

    @Override
    public void showAge(int age) {
        System.out.println(" age is "+age);
    }
    
}
