
package IOtest.nioTest;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreation {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("D:\\abc\\niotest\\piyali.txt");
            Path p1=Files.createFile(p);
            System.out.println("file created");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
