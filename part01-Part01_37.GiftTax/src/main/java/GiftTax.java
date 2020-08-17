
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double val ;
        System.out.println("Value of the gift?");
        int number = Integer.valueOf(scan.nextLine());
        if(number < 5000){
            System.out.println("No tax!");
        }else if(number >= 5000 && number < 25000){
            val = 100 + ((number - 5000) * 0.08);
            System.out.println("Tax: " + val );
        }else if(number >= 25000 && number< 55000){
            val = 1700 + ((number - 25000) * 0.10);
            System.out.println("Tax: " + val );
        }else if(number >= 55000 && number< 200000){
            val = 4700 + ((number - 55000) * 0.12);
            System.out.println("Tax: " + val );
        }else if(number >= 200000 && number< 1000000){
            val = 22100 + ((number - 200000) * 0.15);
            System.out.println("Tax: " + val );
        }else if(number >= 1000000){
            val = 142100 + ((number - 1000000) * 0.17);
            System.out.println("Tax: " + val );
        }
        
    }
        
}
