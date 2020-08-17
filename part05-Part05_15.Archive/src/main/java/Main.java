
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<item> items = new ArrayList<>();

 

        while (true) {

            System.out.println("Identifier? (empty will stop)");

            String Identifier = scanner.nextLine();

            if (Identifier.isEmpty()) {

                break;

            }

 

            System.out.println("Name? (empty will stop)");

            String Name = scanner.nextLine();
            
            if (Name.isEmpty()) {

                break;

            }
            
           
                item item1 = new item(Identifier,Name);
                if(items.contains(item1)){
                    break;
                }else{ 
                    items.add(item1);
                }    
        }  
        
        for(int i = 0 ; i < items.size();i++){
            //if(items.contains(items.get(i))){
              //  break;
            //}else{    
                System.out.println(items.get(i));
            //}
        }
    }
}
