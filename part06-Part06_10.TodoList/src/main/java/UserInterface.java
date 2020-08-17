import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class UserInterface {
    
    private TodoList List;
    private Scanner scanner;
    
    public UserInterface(TodoList List,Scanner scanner){
        this.List = List;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String str = scanner.nextLine();
            if(str.equals("stop")){
                break;
            }else if(str.equals("add")){
                System.out.println("To add:");
                String task = scanner.nextLine();
                this.List.add(task);
            }else if(str.equals("list")){
                this.List.print();
            }else if(str.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                this.List.remove(index);
            }
        }
    }
    
}
