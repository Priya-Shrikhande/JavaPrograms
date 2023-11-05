//Write a Java program to demonstrate Upcasting Vs Downcasting
package Assignment_1;


class Computer {
    void playsMusic() {
        System.out.println(" playing");
    }
}

class MusicPlayer extends Computer {

    @Override
    void playsMusic() {
        System.out.println("song");
    }
    
}
public class Question5 {
    public static void main(String[] args) {
        Computer c = new MusicPlayer(); // Upcasting

        c.playsMusic();

        MusicPlayer m=(MusicPlayer)c;  //downcasting
        m.playsMusic();
    }
}
