
package abstraction;

public class TestInterface {
    public static void main(String[] args) {
        StudentInter si;
        si=new StudentImpl();
        si.showAge(25);
        si.showName("priya");
        si.course();
        StudentInter.institute();
    }
}
