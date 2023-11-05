package inner.cls;

class Outer{
    int x=100;
    class Inner{
        int y=200;
        void display(){
            System.out.println("I'm not static iiner class "+(x+y));
        }
    }
}

public class TestNonStaticInnercls {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner obj=o.new Inner();
        obj.display();
    }
}
