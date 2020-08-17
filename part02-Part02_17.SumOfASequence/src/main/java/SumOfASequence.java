
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        int i = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        
        while(i <= number){
            
            result = result + i;
            i++;
        }
        System.out.println("The sum is " + result);
    }
}
