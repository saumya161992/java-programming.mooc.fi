
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0.00;
        double avg = 0.00;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                
                break;
            }else{
                count++;
                sum = sum + number;
            }
            
        }
        //System.out.println("sum is "+ sum);
        //System.out.println("count is " + count);
        avg = 1.00*(sum/count);
        System.out.println("Average of the numbers: "+ avg);

    }
}
