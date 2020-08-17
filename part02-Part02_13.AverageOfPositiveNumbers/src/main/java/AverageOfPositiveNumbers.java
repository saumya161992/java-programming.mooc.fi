
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    
    
    
    public static void main(String[] args) {
        
        double  sum = 0.00;
        int count = 0;
        double avg ;
    
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else if(number > 0){
                sum = sum + number;
                count++;
            }
        }
        //System.out.println("sum is "+ sum);
        //System.out.println("count" + count);
        if(count<1){
            System.out.println("Cannot calculate the average");
        }else{
            avg = 1.0 *(sum/count);
            System.out.println("Average of the numbers: "+avg);
        }
    }
}
