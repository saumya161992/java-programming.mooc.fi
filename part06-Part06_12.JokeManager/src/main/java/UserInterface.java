
import java.util.Scanner;
import java.util.Random;
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
    
    private JokeManager manager;
    private Scanner scanner;  
    
    public UserInterface(JokeManager manager,Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
     public void start() {

        while (true) {

            this.list();

            

            String command = scanner.nextLine();

            

            if (command.equals("X")) {

                return;

            }

            

            this.commands(command);

        }

    }

    

    public void list() {

        System.out.println("Commands:");

        System.out.println("1 - add a joke");

        System.out.println("2 - draw a joke");

        System.out.println("3 - list jokes");

        System.out.println("X - stop");

    }

    

    public void commands(String command) {

        

        if (command.equals("1")) {

            this.addJoke();

        }

        

        if (command.equals("2")) {

            this.drawJoke();

        }

        

        if (command.equals("3")) {

            this.listJokes();

        }

    }

    

    public void addJoke() {

        System.out.println("Write the joke to be added:");

        String joke = this.scanner.nextLine();

        this.manager.addJoke(joke);

    }

    

    public void drawJoke() {

        System.out.println(this.manager.drawJoke());

    }

    

    public void listJokes() {

        this.manager.printJokes();

    }

}