

import java.util.Scanner;


public class Stephanie1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        double Ftax = 0.15;
        double Ftax2;
        double Stax = 0.035;
        double Stax2;
        double SST = 0.0575;
        double SST2;
        double MMtax =  0.0275;
        double MMtax2;
        double PPlan = 0.05;
        double PPlan2;
        double Health = 75;
        double Netpay;
        double Add;
        double Gross;
        
 
        System.out.print("Input the Employee Name:");
        String employee = input.nextLine();
        System.out.print("Gross Amount:");
        Gross = input.nextDouble();
        
        
        Ftax2 = Gross * Ftax;
        Stax2 = Gross * Stax;
        SST2 = Gross * SST;
        MMtax2 = Gross * MMtax;
        PPlan2 = Gross * PPlan;
        Netpay = Ftax2 + Stax2 + SST2 + MMtax2 + PPlan2 + Health;
        Add = Gross - Netpay;
        
        System.out.printf("Name" + employee);
        System.out.printf("Gross Amount:$%.2f" , Gross);
        System.out.println();
        System.out.printf("\nFtax: S%.2f",Ftax2);
        System.out.printf("\nStax:$%.2f",Stax2);
        System.out.printf("\nSST:$%.2f",SST2);
        System.out.printf("\nMMtax:$%.2f",MMtax2);
        System.out.printf("\nPPlan:$%.2f",PPlan2);
        System.out.printf("\nHealth insure: $75.00" , Health);
        System.out.printf("\nNet Pay: $%.2f",Add);
    }
    
}
