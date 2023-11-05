
package LabTask15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Que8des {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(FileInputStream fin=new FileInputStream("book.ser");
                ObjectInputStream oo=new ObjectInputStream(fin)) {
                    Book b=(Book)oo.readObject();
                    System.out.println("Book name : "+b.book_name);
                    System.out.println("Book ISBN : "+b.book_ISBN);
                }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
