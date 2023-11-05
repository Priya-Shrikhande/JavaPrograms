
package packageDemo;

import packageDemo.pack1.FirstDemo;
import packageDemo.pack2.SeconfDemo;

public class TestPackageDemo {
    public static void main(String[] args) {
//        packageDemo.pack1.FirstDemo fd=new packageDemo.pack1.FirstDemo();
//        packageDemo.pack2.FirstDemo fd1=new packageDemo.pack2.FirstDemo();
        
        FirstDemo fd=new FirstDemo();
        SeconfDemo fd1= new SeconfDemo();
        fd.show();
        fd1.show();
    } 
}
