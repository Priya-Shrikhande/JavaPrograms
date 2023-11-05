package pattern;

import java.util.Scanner;

public class TrianglePattern {
    void equilateralTriangle(){
        for(int i=0;i<5;i++){   //rows
            for(int j=4;j>i;j--){
                System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
//     void dynaequilateralTriangle(){
//         int size;
//         //Scanner sc=new Scanner();
//        for(int i=0;i<5;i++){   //rows
//            for(int j=4;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//     }
    
     void revEquilateralTriangle(){
        for(int i=0;i<5;i++){   //rows
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        TrianglePattern t=new TrianglePattern();
        t.equilateralTriangle();
        t.revEquilateralTriangle();
    }         
}
