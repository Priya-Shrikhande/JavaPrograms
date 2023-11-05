
package lab_task_6;
abstract class Bank{
    int getBalace(){
        return 0;
    }
}
class BankA extends Bank{
    @Override
    int getBalace() {
        return 10000;
    }
    
}
class BankB extends Bank{
    @Override
    int getBalace() {
       return 15000;
    }
    
}
class BankC extends Bank{
    @Override
    int getBalace() {
        return 20000;
    }
   
}
public class MainClass {
    public static void main(String[] args) {
        int x,y,z;
        Bank b;
        
        b=new BankA();
        x=b.getBalace();
        System.out.println("Bank A has "+x+" rupees");
        
        b=new BankB();
//        y=b.getBalace();
        System.out.println("Bank A has "+b.getBalace()+" rupees");
        
        b=new BankC();
        z=b.getBalace();
        System.out.println("Bank A has "+z+" rupees");
    }
}
