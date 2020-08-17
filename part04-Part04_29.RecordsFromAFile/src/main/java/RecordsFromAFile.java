
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                System.out.println(name + ", age: " + age +" years");
                //System.out.println("Age: " + age);
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
}
