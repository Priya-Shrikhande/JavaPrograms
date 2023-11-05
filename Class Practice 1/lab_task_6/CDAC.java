
package overloading;
class Demo
{
    int a,b;
    Demo()
    {
      a=20;
      b=30;
    }
    Demo(int x,int y)
    {
        a=x;
        b=y;
    }
}
public class CDAC {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println("a="+d.a+" b="+d.b);
        System.out.println("sum of a & b is:"+(d.a+d.b));
        
        Demo d1=new Demo(30, 10);
        System.out.println("x="+d1.a+" y="+d1.b);
        System.out.println("sum of x & y is:"+(d1.a+d1.b));      
    }  
}
