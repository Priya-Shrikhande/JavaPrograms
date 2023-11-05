
package ClassAndObject;
class Complex{
    float real,img;

    public Complex() {
    }

    public Complex(float real, float img) {
        this.real = real;
        this.img = img;
    }
    
    void set(float r, float i){
        real=r;
        img=i;
    }
    void disp(){
        System.out.println(real+"+i"+img);
    }
   static Complex sum(Complex com1,Complex com2){
        float r=com1.real+com2.real;
        float i=com1.img+com2.img;
        
        return new Complex(r, i);
    }
}
public class que02 {
    public static void main(String[] args) {
        
       
        Complex c1=new Complex();
        Complex c2=new Complex();
        Complex c3;
        
        Complex cc=new Complex(12.23f, 10.23f);
        
        System.out.println("first complex num is : ");
        c1.set(3f, 5f);
        c1.disp();
        
         System.out.println("second complex num is : ");
         c2.set(4.2f, 7.2f);
         c2.disp();
         
        c3=Complex.sum(c1,c2);
        
        System.out.println("addition of first and second complex numbers is : ");
        c3.disp();
    
        
         
    }
}
