
import java.util.ArrayList;
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
public class JokeManager {
    
    private ArrayList<String> jokes;
    public JokeManager(){
        
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke){
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        int index=0 ;String str = " ";
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
            
        }else{
            Random draw = new Random();
            index = draw.nextInt(jokes.size());
            str =  jokes.get(index);   
            return str;
        }
    }
    
    public void printJokes(){
        
        for( String jk : jokes  ){
            System.out.println(jk);
        }
    }
}
