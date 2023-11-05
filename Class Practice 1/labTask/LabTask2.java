package labTask;
 abstract class Person{
        abstract void eat();
        abstract void exercise();
    }
    class Athelete extends Person{
        @Override
        void eat() {
            System.out.println("Athelete eats healthy diet");
        }

        @Override
        void exercise() {
            System.out.println("Athelete exercises daily 3 hours");
        }
    }
    class LazyPerson extends Person{
        @Override
        void eat() {
            System.out.println("Lazyperson always eats fast food");
        }

        @Override
        void exercise() {
            System.out.println("Lazyperson does not do any exercise");
        }
        
    }

public class LabTask2 {
    public static void main(String[] args) {
        Athelete a=new Athelete();
        LazyPerson l=new LazyPerson();
        
        System.out.println("Athelete info: ");
        a.eat();
        a.exercise();
    
        System.out.println("***********************************************");
        System.out.println("Lazyperson info : ");
        l.eat();
        l.exercise();
    }
}
