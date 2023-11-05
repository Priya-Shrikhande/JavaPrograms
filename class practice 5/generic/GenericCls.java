package generic;

class Container{
    String contain;

    public Container(String contain) {
        this.contain = contain;
    }

    public String getContain() {
        return contain;
    }
    
    public void showType(){
        System.out.println(contain.getClass().getName());
    }
}
public class GenericCls {
    public static void main(String[] args) {
        Container c=new Container("CDAC");
        System.out.println(c.getContain());
        c.showType();
    }
    
}
