
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int wins = 0;
        int loses = 0;
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {

    
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            
            String[] parts = line.split(",");
            String hometeam = parts[0];
            String visitingteam = parts[1];
            int homepoints = Integer.valueOf(parts[2]);
            int visitingpoints = Integer.valueOf(parts[3]);
            
            if(hometeam.equals(team) || visitingteam.equals(team)){
                //System.out.println("jjjj");
                count = count +1;
            if(hometeam.equals(team)){
            if(homepoints > visitingpoints){
                wins = wins +1;
            }else{
                loses = loses + 1;
            }
            }else{
              if(homepoints > visitingpoints){
                loses = loses +1;
            }else{
                wins = wins + 1;
            }
            
            
            }
            }

       
        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: "+ count);
        System.out.println("Wins: "+ wins);
        System.out.println("Losses: "+ loses);
        

    }

}
