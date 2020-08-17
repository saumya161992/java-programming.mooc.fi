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
public class Package{
   
    private ArrayList<Gift> Pack;
    public Package(){
    this.Pack = new ArrayList<>();
   }
    
    public void addGift(Gift gift){
        
        this.Pack.add(gift);
    }
    
    public int totalWeight(){
        
        int sumOfweight = 0;
        for(Gift  gift : Pack){
            sumOfweight += gift.getWeight();
        }
        return  sumOfweight ;
    }
        
        
    
}
