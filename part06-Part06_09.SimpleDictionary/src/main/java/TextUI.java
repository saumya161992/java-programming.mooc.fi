import java.util.Scanner;
//import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary book;
    public TextUI(Scanner scanner,SimpleDictionary book){
        this.scanner = scanner;
        this.book = book;
        
    }
    
    public void add(String word, String translation){
        
        this.book.add(word,translation);
        
    }
    public void start(){
        while(true){
            System.out.println("Command:");
            String word = scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(word.equals("add")){
                    System.out.println("Word:");
                    String newword = scanner.nextLine();
                    System.out.println("Translation:");
                    String translation = scanner.nextLine();
                    this.add(newword,translation);
                
            }
            else if(word.equals("search")){
                System.out.println("To be translated:");
                String text = scanner.nextLine();
                this.search(text);
                /*if(translated.equals("")){
                    System.out.println("Word "+ text+" was not found");
                }else{
                System.out.println("Translation:" + translated );}*/
            }else if(!word.equals("end") || (!word.equals("add")) || (!word.equals("search")) ){
                    System.out.println("Unknown command");
                    continue;
            }
        }
    }
    
    public void search(String text){
        if(this.book.translate(text)== null){
            System.out.println("Word " + text + " was not found");
            //return ;
        }else{
        System.out.println("Translation: " + this.book.translate(text));
        }    }
    
}
