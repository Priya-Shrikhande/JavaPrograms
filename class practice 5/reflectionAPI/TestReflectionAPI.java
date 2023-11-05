package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        private void showInfo(){
            System.out.println("hello "+name+", your age is "+age);
        }
    }
public class TestReflectionAPI {
    
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
        //create class reference
        Class peroncls=Person.class;
        
        Constructor cons=peroncls.getDeclaredConstructor(String.class,int.class);
        Object object=cons.newInstance("priya",25);
        
        Field fname=peroncls.getDeclaredField("name");   //changing private data name
        fname.setAccessible(true);
        fname.set(object, "piyali");
        
        
        Method m=peroncls.getDeclaredMethod("showInfo");
        m.setAccessible(true);
        m.invoke(object);
        
        String s=(String)fname.get(object);
        System.out.println(s);
        
        Field fage=peroncls.getDeclaredField("age");
        fage.setAccessible(true);
        int ag=fage.getInt(object);
        System.out.println(ag);
        
       }
}
