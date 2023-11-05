
package pattern;

public class Diamond {
    public static void main(String[] args) {
        for(int i=1;i<=11;i++){
            for(int j=1;j<=11;j++){
                if(j==7 && i==1 || i==2 && (j>4 && j<8)){
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
