
package WrapperClass;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter integer : ");
        i=sc.nextInt();
        Integer integer= ++i;
        System.out.println("increament integer = "+integer);
        
    }
}
