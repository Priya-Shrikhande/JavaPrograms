
package Assignment_1;


abstract class Instrument {
    abstract void play();
    abstract void tune();
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the piano...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano...");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar...");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar...");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Piano p=new Piano();
        Guitar g=new Guitar();
        
        p.play();
        p.tune();
        
        g.play();
        g.tune();
        }
    }

