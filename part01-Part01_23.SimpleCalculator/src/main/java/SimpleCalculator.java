
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double div = (double)num1/num2;
        System.out.println(" " + num1 + " + " + num2 + " = " + sum);
        System.out.println(" " + num1 + " - " + num2 + " = " + sub);
        System.out.println(" " + num1 + " * " + num2 + " = " + mul);
        System.out.println(" " + num1 + " / " + num2 + " = " + div);

    }
}
