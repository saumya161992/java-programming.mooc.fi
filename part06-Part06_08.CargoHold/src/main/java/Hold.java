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
public class Hold {
    private int count = 0;
    private int maxweight;
    private ArrayList<Suitcase> holder;
    public Hold(int maxweight){
        
       this.holder = new ArrayList<>(); 
       this.maxweight = maxweight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int capacity = this.totalWeight() + suitcase.totalWeight();
        if(capacity <= this.maxweight){
            this.holder.add(suitcase);
            count++;
        }
       
        
        
    }
    
    public int totalWeight(){
        int totalweight = 0;
        for(Suitcase st : this.holder){
            
            totalweight = totalweight + st.totalWeight();
        }
        return totalweight;
    }
    
    public void printItems(){
        for(Suitcase st : holder){
            st.printItems();
        }
    }
   
    //x suitcases (y kg)
    public String toString(){
        if (this.holder.isEmpty()) {

            return "0 suitcases (0 kg)";

        } else if (this.holder.size() == 1) {

            return "1 suitcase (" + this.totalWeight() + " kg)";

        } else {

            return this.holder.size() + " suitcases (" + this.totalWeight() + " kg)";

        }
    }
    
}
