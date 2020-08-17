
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
public class RecipeBook {
    
    private ArrayList<recipe>  RecipeBook;
    
    public RecipeBook(){
        
        this.RecipeBook = new ArrayList();
    }
    
    public void addRecipe(recipe foodrecipe){
        RecipeBook.add(foodrecipe);
    }
    
    public void search(String word){
        for(recipe rr : RecipeBook){
            if(rr.getname().contains(word)){
                System.out.println(rr.toString());
            }
        }
    }
    
    public void searchbytime(int time){
        for(recipe rr : RecipeBook){
            if(rr.gettime() <= time){
                System.out.println(rr.toString());
            }
        }
    }
    
    public void searchbyingredient(String ingred){
        for(recipe rr : RecipeBook){
            if(rr.containsIngredient(ingred)){
                System.out.println(rr.toString());
            }
        }
    }
    
    public String toString(){
        String str = "";
    
        for(recipe rr : RecipeBook){
            str+= rr.toString() +"\n";
        }return str;
    }
    
}
