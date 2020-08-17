
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        
        int count = 0;
        int sum = 0;
        double avg = 0.0;
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list = new ArrayList<>();
        // adding them on a list until user gives -1.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        // Then it computes the average of the numbers on the list
        count = list.size();
        for(int i = 0;i< count;i++){
            sum = sum + list.get(i);
        }
        avg = (1.0 * sum)/count;
        // and prints it.
        System.out.println("Average: "+avg); 
        
    }
}
