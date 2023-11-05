
package Assignment_1;

class Specifiers{
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=50;
   
    public void Show1(){
        System.out.println("public variable="+a);
    }
    
    
    private void Show2(){
        System.out.println("private variable="+b);
    }
    
    
    protected void Show3(){
        System.out.println("Protected variable="+c);
    }
    
    void show4(){
        System.out.println("Default variable="+d);
        Show2();
    }
}

class Test extends Specifiers{
     void display(){
        System.out.println("Protected variable in Child Class");
        Show3();
    }
    
}

public class Que6 {
    public static void main(String[] args) {
        Test t=new Test();
       t.display();
       Specifiers s=new Specifiers();
       s.show4();
       s.Show1();
    }
}
