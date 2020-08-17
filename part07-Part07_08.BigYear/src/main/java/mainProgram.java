
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        String name = "";
        String Latinname = "";
        Birds bb = new Birds();
        //Bird newbee=new Bird(name,Latinname) ;
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Add")){
                System.out.println("Name");
                name = scan.nextLine();
                System.out.println("Name in Latin:");
                Latinname = scan.nextLine();
                 Bird newbee = new Bird(name,Latinname);
                
                bb.addobservation(newbee);
            }else if(command.equals("Observation")){
                System.out.println("Bird?");
                String findbird = scan.nextLine();
                
                if(bb.search(findbird)== true){
                    //count++;
                    continue;
                }else{
                    System.out.println("Not a bird!");
                }
            }else if(command.equals("All")){
                     System.out.println(bb.toString());
            }else if(command.equals("One")){
                    System.out.println("Bird?");
                    String searchbird = scan.nextLine();
                    bb.searchonebird(searchbird);
            } 
                if(command.equals("Quit")){
                break;
            }
        }
    }

}
