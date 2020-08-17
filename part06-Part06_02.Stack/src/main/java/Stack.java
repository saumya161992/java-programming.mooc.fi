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
public class Stack {
    private ArrayList<String> Stack;
    public Stack() {
        this.Stack = new ArrayList<>();
    }

    
    
    public boolean isEmpty(){
        if(Stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        this.Stack.add(value);
    }
    
    public ArrayList<String> values(){
        return Stack;
    }
    
    public void remove(String song) {
        this.Stack.remove(song);
    }
    
    public String take(){
        
        //for(int i = 0; i < Stack.size();i++){
            
        //}
        int lastIndex = this.Stack.size() - 1;

        String removed = this.Stack.get(lastIndex);

        this.Stack.remove(lastIndex);

        

        return removed;
        
    }
    
}
