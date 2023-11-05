
package has.a.relationship;

class Car{
    private String name;
    private Engine engine;
    
    public Car(String name,Engine engine){
        this.name=name;
        this.engine=engine;
    }
    
    void CarDetails(){
         System.out.println("Car Details");
        System.out.println("Name : "+name);
        
    }
}
class Engine{
     private String model;
    private int horsepower;
    
    public Engine(String model, int horsepower) {
        this.model = model;
        this.horsepower = horsepower;
    }
    
}
public class TestComposition {
    public static void main(String[] args) {
        
    }
}
