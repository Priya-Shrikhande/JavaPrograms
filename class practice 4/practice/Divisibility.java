import java.util.Scanner;
public class Divisibility {
    int number;
    void conditions()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it's divisibility with 8 & 5 :");
        number=sc.nextInt();
        if(number%8==0  && number%5==0)
        {
            System.out.println("Number"+number+" is divisible by 8 & 5");
        } 
        else if(number%8==0)
        {
            System.out.println("Number"+number+" is divisible by 8");
        } 
        else if(number%5==0)
        {
            System.out.println("Number"+number+" is divisible by 5");
        } 
        else 
        {
            System.out.println("Number"+number+" is neither divisible by 8 nor 5");
        } 
    }
    public static void main(String[] args)
    {
        Divisibility d=new Divisibility();
        d.conditions();
    }
}
