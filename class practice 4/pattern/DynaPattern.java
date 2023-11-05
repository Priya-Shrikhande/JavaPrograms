package pattern;

import java.util.Scanner;

public class DynaPattern {
     
   int size;
    void equilateralTriangle(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter size of pattern");
        size=sc.nextInt();
        char ch='A';
        for(int i=0;i<size;i++){   //rows
            for(int j=size;j>i;j--){
                System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
                System.out.print(" "+ch++);
            }
            System.out.println("");
        }
       
    }
    
    
 void revDynaEquiPattern(){ 
     
        for(int i=0;i<size;i++)
        { 
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=size;j>i;j--)
            {
                System.out.print(" "+j);
            }
            System.out.println("");
        }
 }
    
    
    public static void main(String[] args) {
       
        DynaPattern d=new DynaPattern();
        d.equilateralTriangle();
        d.revDynaEquiPattern();
    }
}
