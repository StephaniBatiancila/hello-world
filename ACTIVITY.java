
import java.util.Scanner;


public class ACTIVITY {

   
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int number;
       int sum;
       
       number = in.nextInt();
       
       if (number < 0)
           number = -number;
       sum = 0;
       while (number > 0)
       {
           sum = sum + number %10;
           number = number / 10;
       }
          System.out.println(" The sum is " + sum);
    }
    
}
