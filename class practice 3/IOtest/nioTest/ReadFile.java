
package IOtest.nioTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("D:\\abc\\niotest\\piyali.txt");
            List<String> lst=Files.readAllLines(p);
            for(String str:lst){
                System.out.println(str);
            }          
        }
        catch(Exception e){
                    System.out.println(e.getMessage());
        }
    }
}
