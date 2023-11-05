
package abstraction;

abstract class LivingThing{
    void eyes(){
        System.out.println("two eyes"); 
    }
    void mouth(){
        System.out.println("one mouth");
    }
    abstract void legs();
}


class Human extends LivingThing{

    @Override
    void legs() {
        System.out.println("two legs");
    }
}


class Animal extends LivingThing{

    @Override
    void legs() {
        System.out.println("four legs");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        LivingThing it;
        
        System.out.println("properties of human");
        it=new Human();
        it.eyes();
        it.mouth();
        it.legs();
        
        System.out.println("****************************************");
        System.out.println("properties of animal");
        it=new Animal();
        it.eyes();
        it.mouth();
        it.legs();
    }
}
