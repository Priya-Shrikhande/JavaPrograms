
package WrapperClass;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        double num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number = ");
        num=sc.nextDouble();
        Double d=num*num;
        System.out.println("square of entered number is : "+d);
    }
}
