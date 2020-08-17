import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class TodoList {
    
    private ArrayList<String> tasklist;
    public TodoList(){
        this.tasklist = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasklist.add(task);
    }
    
    public void print(){
        int index = 0;
        for(String st : tasklist){
            System.out.println( index +1 +": " + st);
            index++;
        }
    }
    
    public void remove(int number) {
        tasklist.remove(number-1);
    }
    
}
