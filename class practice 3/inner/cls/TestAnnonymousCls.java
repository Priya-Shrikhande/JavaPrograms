package inner.cls;
class ParentOfAnnonymous{
    void greeting(){
        System.out.println("say hello...");
    }
}
class OuterOfAnnonymous{
    
    ParentOfAnnonymous p=new ParentOfAnnonymous(){
        @Override
        void greeting() {
            System.out.println("hiii....");
        }  
    };
}
public class TestAnnonymousCls {
    public static void main(String[] args) {
        OuterOfAnnonymous o=new OuterOfAnnonymous();
        o.p.greeting();
    }
}
