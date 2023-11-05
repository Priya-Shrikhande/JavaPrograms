
package StringAssignment;

public class Sorting {
    public static void main(String[] args) {
        String str1 = "my name is Priya";
        String str2=new String("my name is priya");
        
        String s=" ";
        String str3=str1.concat(str2);        //concanating two string
           

        int x=str1.indexOf('i');       //searching i
        int y=str2.indexOf("Priya");          //searching word priya
        int z=str1.lastIndexOf("P");
        int i=str1.length();                       //calculating length of str1
        int j=str2.charAt(11);                    //searching charracter at 11 position
        char j1=str2.charAt(11);
        
        char ch[]=str1.toCharArray();                //converting string to array
        
        
          // System.out.println(ch);
           boolean k=str2.contains("Priya");             //checking word priya in string
           int p=str1.compareTo(str2);            //comparing two strings
           int q=str1.compareToIgnoreCase(str2);          //comparing string by ignoring the case 
           
           boolean e=s.isBlank();       //checking if string is null
           boolean f=s.isEmpty();          //checking if string is empty
           //System.out.println(q);
           s=str1.trim();                 
          StringBuffer sb=new StringBuffer(str2);   //converting into string buffer
          sb.reverse();                // reversing the string buffer sb
          
        System.out.println(sb); 
    }
}
