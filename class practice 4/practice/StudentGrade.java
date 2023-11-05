import java.util.Scanner;
class StudentGrade
{
    int eng,math,bio,chem,phy;
    float per,total;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of five subjects :");
        eng=sc.nextInt();
        math=sc.nextInt();
        bio=sc.nextInt();
        chem=sc.nextInt();
        phy=sc.nextInt();
        total=eng+math+bio+chem+phy;
        per=(total/250)*100;
        System.out.println("percentage :"+per);
        System.out.println("total :"+total);
    }
    void showdata()
    {
        getdata();
        if(per>=90)
        {
            System.out.println("Your grade is A+");
        }
        else if(per>=80)
        {
            System.out.println("Your grade is A");
        }
        else if(per>70)
        {
            System.out.println("Your grade is B+");
        }
        else if(per>=60)
        {
            System.out.println("Your grade is B");
        }
        else if(per>=50)
        {
            System.out.println("Your grade is C");
        }
        else
        {
            System.out.println("Your grade is FAIL");
        }
    }
    public static void main(String[] args)
    {
        StudentGrade sg=new StudentGrade();
        sg.showdata();
    }
}

