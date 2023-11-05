//WAP in Java to find number is palindrome or not.
import java.util.Scanner;
public class Fibonicci {
    int a=0,b=1,sum,num;
    void fibonici_number()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate fibonici series :");
        num=sc.nextInt();
        System.out.println(+a+" "+b);
        for(int i=1;i<=num;i++)
        {
            sum=a+b;
            
        }
    }
    public static void main(String[] args)
    {
        Fibonicci f=new Fibonicci();
        f.fibonici_number();
    }
}
