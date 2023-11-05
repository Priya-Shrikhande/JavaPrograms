package generic;

import java.util.List;

public class GenericMethods {
//    public static void showData(String arr[]){
//        for(String s:arr)
//            System.out.println(s);
//    }
//    
//    public static void showData(Integer arr[]){
//        for(Integer s:arr)
//            System.out.println(s);
//    }
    
//    public static <E>void showData(E arr[]){           //GENERIC METHOD
//        for(E s:arr)
//            System.out.println(s);
//    }
    
//    public static <E>void showData(List<E> lst){           //WILDCARD USE
//        for(E s:lst)
//            System.out.println(s);
//        
//    }
    
//    public static void showData(List<? extends Number> lst){           //upper bound  
//        for(Number s:lst)
//            System.out.println(s);
//        
//    }
    
    public static void showData(List<? super Integer> lst){           //lower bound  
        for(Object s:lst)
            System.out.println(s);
        
    }
    public static void main(String[] args) {
        String names[]={"ramesh","suresh","dinesh"};
        Integer ages[]={23,34,24};
        
//        showData(names);
//        showData(ages);
            List <String>lst1=List.of("ramesh","suresh","dinesh");
            List <Integer>lst2=List.of(23,34,24);
            List <Number>lst3=List.of(23.11,34.22,24.33);

            //showData(lst1);
            showData(lst2);
            showData(lst3);
    }
}
