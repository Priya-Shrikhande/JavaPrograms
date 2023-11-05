package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//        List<String> lst=List.of("ramesh","suresh","bhavesh","diensh","mahesh");
//        
//        for(String s:lst){
//            System.out.println(s);
//        }
//        System.out.println("********************");
//        //lst.stream().forEach(e->System.out.println(e));
//        lst.stream().forEach(System.out::println);    //method reference

        List<Integer> lst=List.of(12,34,23,56,67);
        System.out.println(lst);
        //lst.stream().forEach(e->System.out.println(e));
        
//        List<Integer> evenlst=lst.stream().filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(evenlst);

          //  lst.stream().map(i->i+5).forEach(System.out::println);
          
//            List evenlst=lst.stream().map(i->i+5).collect(Collectors.toList());
//            System.out.println(evenlst);

                //lst.stream().sorted().forEach(System.out::println);
                //lst.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println); //descending order
//                Integer i=lst.stream().max((x,y)->y.compareTo(x)).get();  //
//                System.out.println(i);
                
                String arr[]={"ramesh","suresh","bhavesh","diensh","mahesh"};
                Arrays.stream(arr).filter(e->e.startsWith("r")).forEach(System.out::println);  //printing name starts with 'r'
                
                
                
    }
}
