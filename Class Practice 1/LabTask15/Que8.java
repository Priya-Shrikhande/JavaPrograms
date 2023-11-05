
package LabTask15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Book implements Serializable{
    String book_name;
    int book_ISBN;
    
    public Book(String book_name,int book_ISBN){
        this.book_name=book_name;
        this.book_ISBN=book_ISBN;
    }
}
public class Que8 {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream f=new FileOutputStream("book.ser");
            ObjectOutputStream o=new ObjectOutputStream(f)) {
                Book b=new Book("book1",12345);
                o.writeObject(b);
                System.out.println("object created successfully");
            }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
