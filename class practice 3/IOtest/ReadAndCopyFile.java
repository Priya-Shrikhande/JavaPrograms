
package IOtest;

import java.io.*;

public class ReadAndCopyFile {
    
    void copyFile(){
        int i;
        try(FileInputStream fin=new FileInputStream("C:\\Users\\Administrator\\Pictures\\th.jpg");
                FileOutputStream fout=new FileOutputStream("C:\\Users\\Administrator\\Pictures\\pic.jpg")){
        do{
            i=fin.read();
            fout.write(i);
        }while(i!=-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ReadAndCopyFile cf=new ReadAndCopyFile();
        cf.copyFile();
    }
}
