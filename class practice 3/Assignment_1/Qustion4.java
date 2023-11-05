//Write a Java program to create an abstract class GeometricShape with abstract methods area()
//and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
//class and implement the respective methods to calculate the area and perimeter of each shape.

package Assignment_1;


abstract class GeometricShape{
    abstract float area();
    abstract float perimeter();
}

class Triangle extends GeometricShape{
    
   float base;
   float height;
   float side1;
   float side2;
   float side3;
   
   void Triangleinfo(float b, float h, float s1, float s2, float s3) {
        this.base = b;
        this.height = h;
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    Triangle() {
        
    }
    
    @Override
    float area() {
        return (float) (0.5 * base * height);
    }

    @Override
    float perimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle extends GeometricShape{

    float width;
    float length;
    
    void rectangleinfo(float w, float l) {
        this.width = w;
        this.length = l;
    }

    Rectangle() {
        
    }
    @Override
    float area() {
        return width * length;
    }

    @Override
    float perimeter() {
        return 2 * (width + length);
    } 
}
public class Qustion4 {
    public static void main(String[] args) {
        float ta,tp,ra,rp;
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();
        
        System.out.println("Triangle.....");
        t.Triangleinfo(2, 5, 3, 4, 5);
        ta=t.area();
        tp=t.perimeter();
        System.out.println("area of triangle : "+ta+"  and perimeter : "+tp);
        
        
        System.out.println("Rectangle.......");
        r.rectangleinfo(5, 7);
        ra=r.area();
        rp=r.perimeter();
        System.out.println("area of rectangle : "+ra+"  and perimeter : "+rp);
    }
}
