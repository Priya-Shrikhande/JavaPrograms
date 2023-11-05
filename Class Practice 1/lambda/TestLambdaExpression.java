
package lambda;

interface LengthFinder{           //functional interface
    int strLength(String str);      //abstract method
}

public class TestLambdaExpression {
    public static void main(String[] args) {
        LengthFinder lf= (str)->str.length();
        System.out.println("length of string: "+lf.strLength( "gfhdfjgkgkghgyfhjv"));
        
        Runnable r=()->{
            for(int i=0;i<10;i++){
                System.out.println("i= "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException ex){
                    
                }
            }
        };
        r.run();
    }
}
