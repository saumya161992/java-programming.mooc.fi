
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int count = 0;       
        while(true){
             String text = scanner.nextLine();
        
            if(text.equals("end")){
                System.out.println(count);
                break;
            }
            count = count +1;
        }    
    }
}
