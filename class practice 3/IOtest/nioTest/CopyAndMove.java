
package IOtest.nioTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyAndMove {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("D:\\abc\\niotest\\piyali.txt");
            Path pcopy=Paths.get("D:\\abc\\piya.txt");
            Files.move(pcopy, pcopy);
            System.out.println("move completed");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
