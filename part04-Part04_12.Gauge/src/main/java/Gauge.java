/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Gauge {
    
    private int value;
    
    public void increase(){
          if(this.value <= 4){ 
            this.value = this.value +1;
          }
    }
    
    public void decrease(){
       
            
            if(this.value >= 1){    
                System.out.println("kkk" + this.value);
                this.value = this.value - 1;
                
            }
    }
    
    public int value(){
        return value;
    }
    
    public boolean full(){
        if( this.value == 5){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    public static void main(String[] args) {
        
        Gauge  g  = new Gauge();
        
        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }
        
        System.out.println("Full! Value: " + g.value());
        g.decrease();
        g.decrease();
        g.decrease();
        g.decrease();
        g.decrease();
        g.decrease();
        g.decrease();
       
        System.out.println("Not full! Value: " + g.value());

    }
    
}
