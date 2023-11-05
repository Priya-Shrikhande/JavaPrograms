
package Assignment_1;

class Outer{
        int a=5;
        static class Inner{
            void show(){
                 int b=10;
            Outer o=new Outer();
                System.out.println("Static Inner class="+(o.a+b));
            }
        }
    }
class Outer1{
    int i=30;
    class Inner1{
        void display(){
            int j=50;
            System.out.println("Non static Inner class="+(i+j));
        }
    }
}

class Parent{
    void Test(){
        System.out.println(" parent class");
    }
}
class Child{
    Parent p=new Parent()
    {
       void Test(){
        System.out.println(" Annonymous class");
       }
    };
    
}
public class Que7 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
        
        Outer1 obj2=new Outer1();
        Outer1.Inner1 obj3=obj2.new Inner1();
        obj3.display();
        Child ch=new Child();
        ch.p.Test();
    }
}
