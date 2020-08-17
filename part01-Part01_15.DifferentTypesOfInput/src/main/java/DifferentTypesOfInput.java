
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        Integer value=Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double floatingpoint = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean trueOrfalse = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + floatingpoint);
        System.out.println("You gave the boolean " + trueOrfalse);

    }
}
