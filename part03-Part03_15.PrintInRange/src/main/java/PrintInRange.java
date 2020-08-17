
import java.util.ArrayList;

public class PrintInRange {
    
    
    public static void printNumbersInRange(ArrayList<Integer> valuerange, int start, int end){
        
        for(int number : valuerange){
            if (number <= end && number >= start ) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
 
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        
        
    }
    
}
