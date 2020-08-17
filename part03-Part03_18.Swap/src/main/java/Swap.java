
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int val1 = 0;
        int val2 = 0;
        int helper = 0 ;
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");
        System.out.println("Give two indices to swap:");
        val1 = Integer.valueOf(scanner.nextLine());
        val2 = Integer.valueOf(scanner.nextLine());
        helper = array[val1];
        array[val1] = array[val2];
        array[val2] = helper;
        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
