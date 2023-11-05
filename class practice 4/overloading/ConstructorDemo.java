
package overloading;
class Test{
    int a;
    Test()
    {
      a=10;
         System.out.println(" "+a);
    }
    Test(int x)
    {
        a=x;
         System.out.println(" "+a);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Test t=new Test();
        Test t1=new Test(500);
    }
}
