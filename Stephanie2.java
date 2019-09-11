
import java.util.Scanner;
public class Stephanie2 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
  
       //Declare
       int time;
       int convTimeMin, convTimeHour, convTimeSec;
       //Prompt
       System.out.print("Enter time in seconds: ");
       time = in.nextInt();
       
       //Compute
       convTimeMin = (time%3600) / 60;
       convTimeHour = (int) time / 3600;
       int secs = time%60;
       
       //Display
       System.out.println("Time is " + convTimeHour + " hour " + convTimeMin + " minutes " + secs + " seconds");
       
       
       
       
       
    }
    
}
