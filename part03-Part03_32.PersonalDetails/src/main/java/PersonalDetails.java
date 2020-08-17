
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

   
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int len = 0;
        String name = "";
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String[] parts = input.split(",");
                sum = sum + Integer.valueOf(parts[1]);
                count = count +1;
                String word = parts[0];
                //System.out.println("name is " + parts[0] + "lenght is " + );
                if(word.length()>len){
                    name = word;
                    len = word.length();
                }
            }
            
        }
        System.out.println("Longest name:"+ name);
        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        }


    }
}
