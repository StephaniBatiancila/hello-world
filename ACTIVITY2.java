
import java.util.Scanner;


public class ACTIVITY2 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int count = 0;
       System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String  sen = sc.nextLine();
       for (int i=0; i<sen.length(); i++){
           char ch = sen.charAt(i);
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
           count++;
           }
        
           System.out.println(+count);
    }  
}
