
package Constructpractice;
public class TestConstruct {
    String s;
    int no;
    TestConstruct(String ss,int num)
   {   s=ss;
        no=num;
   
   }
    void show()
    {
        System.out.println(s+" "+no);
       
    }
        
     public static void main(String []args)
    {
       TestConstruct obj=new TestConstruct("neha",10);       
       obj.show();
    }
                     
}





//public class TestConstruct {
//    int x;
//    TestConstruct()
//    {
//        x=10;
//      System.out.println(x);
//         System.out.println("here constructor calling");
//    }
//    public static void main(String []args)
//    {
//        TestConstruct obj=new TestConstruct();
//          System.out.println(" constructor"+ obj.x);
//       
//    }    
//}
