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
public class Suitcase {
    
    private int count = 0;
    private int maxweight;
    private ArrayList<Item> items;
    public Suitcase(int maxweight){
        
        this.maxweight = maxweight;
        this.items = new ArrayList<>();
    }
    
     public int totalWeight(){
        int totalweight = 0;
        for(Item item : items){
            
            totalweight = totalweight + item.getWeight();
        }
        return totalweight;
    }
    public void addItem(Item item){
        int capacity = this.totalWeight() + item.getWeight();
        if(capacity <= this.maxweight){
            this.items.add(item);
            count++;
        }
                
    }
    
    public void printItems(){
        //System.out.println("The suitcase contains the following items:");
        for(Item it : items){
            System.out.println(it);
        }
    
    }
    
    public Item heaviestItem(){
        
        if(items.size() == 0){
            return null;
        }
        Item heaviest = items.get(0);
        
        for(Item it : items ){
            if(it.getWeight() > heaviest.getWeight()){
                heaviest = it;
            }
        }
        return heaviest;
    }
    
   
    
   
    
    
    public String toString(){
        
        if(items.size() == 0){
            return "no" + " items (" + this.totalWeight() + " kg)";
        }else if(items.size() == 1){
            return count + " item (" + this.totalWeight() + " kg)";
        }
        else{
            return count + " items (" + this.totalWeight() + " kg)";
        }        //x items (y kg)
    }
    
}
