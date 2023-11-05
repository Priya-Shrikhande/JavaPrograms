import java.util.Scanner;
public class EvenOdd {
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
public static void main(String[] args)
{
    EvenOdd eo=new EvenOdd();
    eo.getdata();
}
}
