
package IOtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacter {
    void readcharacters() throws IOException{
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("provide sentence to read its character");
        
        do{
            c=(char)br.read();
            System.out.println(c);
        }while (c!='q');
    }
    public static void main(String[] args) throws IOException {
        ReadCharacter rc=new ReadCharacter();
        rc.readcharacters();
    }
}
