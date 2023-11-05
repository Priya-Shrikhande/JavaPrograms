
package abstraction;


public interface StudentInter {
    int a=10; //public static final int a=10;
    
    void showName(String name); //public abstract void showName();
    void showAge(int age);
    
    default void course(){
        System.out.println("default method");
    }
    static void institute(){
        System.out.println("static method");
    }
    private String exam(){
        return "CET";
    }
    private static String city(){
        return "nagpur";
    }
}