
import java.util.Scanner;

public class Batiancila2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //Declare
        double DriveDi = 9.005;
        double MGallon = 0.255;
        double PGallon = 0.0355;
        
        System.out.println("Enter the driving distance: ");
        DriveDi = in.nextDouble();
        System.out.println("Enter miles per gallons: ");
        MGallon = in.nextDouble();
        System.out.print("Enter price per gallons: ");
        PGallon = in.nextDouble();
        
        //Total
       double total= (DriveDi/MGallon) * PGallon;
       
       //Display
       System.out.printf("The cost of driving: $%.2f " , total);
        
        
        
        
        
    }
    
}
