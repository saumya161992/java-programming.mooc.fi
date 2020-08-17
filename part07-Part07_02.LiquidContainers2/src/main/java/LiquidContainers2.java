
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        
        Container liquidcontain1 = new Container();
        Container  liquidcontain2 = new Container();
        
        System.out.println("First: " + liquidcontain1);
        System.out.println("Second: " +liquidcontain2);
        Scanner scan = new Scanner(System.in);

        while (true) {

            String input = scan.nextLine();

            if (input.equals("quit")) {

                break;

            }

            String[] parts = input.split(" ");

            String command = parts[0];

            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {

                continue;
            }
            
            if(command.equals("remove")){
                liquidcontain2.remove(amount);
                
            }else if (command.equals("add")) {
                liquidcontain1.add(amount);
            }else if(command.equals("move")){
                if(amount > liquidcontain1.contains()){
                    int val = amount-liquidcontain1.contains();
                    liquidcontain1.remove(liquidcontain1.contains());
                    liquidcontain2.add(amount-val);
                }else{
                    liquidcontain1.remove(amount);
                    liquidcontain2.add(amount);
                }
                if(liquidcontain2.contains() > 100){
                    liquidcontain2.remove(liquidcontain2.contains()-100);
                }
            }
             System.out.println("First: "+liquidcontain1 );
             
             System.out.println("Second: " + liquidcontain2);
        }
       
    }

}
