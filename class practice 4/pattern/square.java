
package pattern;

public class square {
    public static void main(String[] args) {
        
//        for(int i=1;i<=7;i++){                         //hollow square
//            for(int j=1;j<=12;j++){
//                if((j>1 && j<7)&& i==2 || (j>1 && j<7)&& i==6 || (i>2 && i<6) && j==9 || (i>2 && i<6) && j==2){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        
        
        for(int i=1;i<=7;i++){                       
            for(int j=1;j<=12;j++){
                if((i>1 && i<7) && (j>1 && j<7)){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
