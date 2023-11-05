/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapcls;

/**
 *
 * @author Administrator
 */
public class constpool {
    public static void main(String[] args) {
        //-128 to 127
        Byte b1=Byte.valueOf("12"); 
        Byte b2=Byte.valueOf("127"); 
        System.out.println(b1==b2);
        System.out.println('\u0042');
        System.out.println('\u0950');
        Short s1=Short.valueOf("156"); 
        System.out.println("");
        Boolean b5=Boolean.valueOf(false);
       Boolean b6=Boolean.valueOf(false);
        System.out.println(b5==b6);
       
       
       //range for character for constant pool'\u0000'to'\u007f'
        System.out.println('\u0950');
       Character b7=Character.valueOf('B');
       Character b8=Character.valueOf('A');
        System.out.println(b7==b8);
       
    }
}
