
package inner.cls;
class Outer{
    int x=10;
    static class InnerStatic{
        int y=20;
        void show(){
            Outer o=new Outer();
            System.out.println("I'm from static inner class"+(o.x+y));
        }
    }
}
public class TestStaticinnerCls {
    public static void main(String[] args) {
        Outer.InnerStatic obj=new Outer.InnerStatic();    //method of calling static inner class
        obj.show();
    }
}
