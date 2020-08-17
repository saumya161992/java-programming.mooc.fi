
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    
    public static void main(String[] args) {
        int val = 0;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        //int input = 0;
        for(int i = 0;i<list.size();i++){
            if(list.get(i) > val){
                val = list.get(i);
            }
        }        
            System.out.println("The greatest number: "+val);
        
    }
}
