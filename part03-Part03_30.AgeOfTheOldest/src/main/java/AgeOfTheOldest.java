
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                
                String[] parts = input.split(",");
                if(Integer.valueOf(parts[1]) > count){
                   count = Integer.valueOf(parts[1]);
                }
            }
            System.out.println("Age of the oldest: " + count);
        }


    }
}
