
package IOtest.nioTest;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteFile {
    public static void main(String[] args) {
        try{
            Path p=Paths.get("D:\\abc\\niotest\\piyali.txt");
            String content="I am priya.";
            
            //for(int i=0;i<10;i++)
                //Files.write(path,content.getBytes(),StandardOpenOption.APPEND);
                
            Files.write(p, content.getBytes(),StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("write complete");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
