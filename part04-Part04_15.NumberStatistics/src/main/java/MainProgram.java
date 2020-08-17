
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        //Statistics statistics = new Statistics();
        Statistics stats = new Statistics();
        Statistics statseven = new Statistics();
        Statistics statsodd = new Statistics();
        
        System.out.println("Enter numbers:");
        while(true){
        number = Integer.valueOf(scanner.nextLine());
        //while(number > -1){
            if(number == -1){
                break;
            }
            
            stats.addNumber(number);
            if(number % 2 == 0 ){
                statseven.addNumber(number);
            }else if(number % 2 == 1)
                statsodd.addNumber(number);
            
        }
        
        
        //statistics.addNumber(3);
        //statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statseven.sum());
        System.out.println("Sum of odd numbers: " + statsodd.sum());
    }
}
