import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;



public class mortgage {
    
    public static void main(String args[]) {
        double Principal=0;
        double Rate=0;
        int time=0;
        Scanner scanner =new Scanner(System.in);

        while(true){
        System.out.print("Principal(Rs100-Rs100,000): ");
        Principal = scanner.nextDouble();
        if (Principal>100 && Principal<100_000)
            break;
        else 
        System.out.println("Please enter in the range of Rs100- Rs100,000");
        }

        while(true){
        System.out.print("Rate: ");
        Rate= scanner.nextDouble();
        if(Rate>0 && Rate<30){
        Rate =(Rate/100)/12;  
        break;
        }
        else
        System.out.println("Please enter a value greater than 0 and lesser than 30");
        }
       
        while(true){
       System.out.print("time period: ");
       time =scanner.nextInt();
       if(time>0 && time<30){
       time = time*12;
       break;}
        else
        System.out.println("Enter another number");
       }

       double mortgage= (Principal * Rate) / (1 - Math.pow(1 + Rate, -time));
        System.out.print("mortgage:" +mortgage );


    }
}
  