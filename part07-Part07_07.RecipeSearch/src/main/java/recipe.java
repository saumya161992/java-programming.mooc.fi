
import java.util.ArrayList;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class recipe {
    
    private String name;
    private int time;
    private ArrayList<String> ingredients;
    
    public recipe(String name,int time){
        
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList();
    }
    
    
    public String getname(){
        return name;
    }
    
    public int gettime(){
        return time;
    }
    
    public void addIngredients(String ingredient){
        ingredients.add(ingredient);
    }
    
    public boolean containsIngredient(String ingredient) {
 
        return this.ingredients.contains(ingredient);
 
    }
    
    public String toString(){
        String str ="";
        String recstr = "";
        /*for( String ing : this.ingredients){
            str +=ing;
        }*/
         recstr = this.name + ", cooking time: " + this.time ;
         return recstr;
    }
}
