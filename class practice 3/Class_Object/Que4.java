//Write the definition for a class called time that has hours and minutes as integer. The
//class has the following member functions:
//void settime(int, int) to set the specified value in object
//void showtime() to display time object
//time sum(time) to sum two time object & return time
//1. Write the definitions for each of the above member functions.
//2. Write main function to create three time objects. Set the value in two objects and
//call sum() to calculate sum and assign it in third object. Display all time objects.

package Class_Object;

class Time{
        int hours,minutes;

        void settime(int h, int m){
            hours=h;
            minutes=m;
        }
        void showtime(){
            System.out.println("Current time is - "+hours+":"+minutes);
        }
        Time sum(Time t){
            Time tm;
            tm.hours=hours+t.hours;
            tm.minutes=minutes+t.minutes;
            return tm;
        }

}
public class Que4 {
    public static void main(String[] args) {
        Time tt1=new Time();
        Time tt2=new Time();
        Time tt3=new Time();
        
        tt1.settime(3, 30);
        tt2.settime(5, 50);
        
        tt3=tt1.sum(tt2);
        
        tt1.showtime();
        tt2.showtime();
        tt3.showtime();
        
    }
}
