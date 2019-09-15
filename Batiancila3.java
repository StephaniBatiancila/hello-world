import java.util.Scanner;

public class Assignment1
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        
        int grades;
        
        
        System.out.println("Enter grades:");
        grades = input.nextInt();
        
        
            if (grades <= 74)
        {
            System.out.println(grades + " poor ");
        }
            else if (grades <= 79)
        {
            System.out.println(grades + " needs improvement");      
        }
            else if (grades <= 84)
        {
            System.out.println(grades + " approaching");   
        }     
            else if (grades <= 94)
        {
            System.out.println(grades + " good");       
        }
            else if (grades <= 100)
        {
            System.out.println(grades + " excellent");   
        }
            else
        {
            System.out.println("error");
        }  
      
    }
    
}
