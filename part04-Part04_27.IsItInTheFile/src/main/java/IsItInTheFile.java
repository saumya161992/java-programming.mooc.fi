
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        int count = 0;
        

        // implement reading the file here.

        try (Scanner scan = new Scanner(Paths.get(file))) {

            while (scan.hasNextLine()) {
                
                 String row = scan.nextLine();
                 if(row.equals(searchedFor)){
                    System.out.println("Found");
                    count = count +1;
                    break;
                 } else if(!row.equals(searchedFor)){
               
                    continue;
                 } 
                 
            }  
            if(count == 0){
                System.out.println("Not found.");     
            }     
            
            
        }catch(Exception e) {

            System.out.println("Reading the file " + file + " failed." );

        }

        
    }
}
