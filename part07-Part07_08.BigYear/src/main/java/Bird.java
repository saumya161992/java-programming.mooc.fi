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
public class Bird {
    
    
    private String name;
    private String Latinname;
    private int observcount;
   
    
    public Bird(String name, String Latinname){
        this.name = name;
        this.Latinname = Latinname;
        this.observcount = 0;
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getLatinname(){
        return this.Latinname;
    }
    
    public int getobservcount(){
        return this.observcount;
    }
    
    public int recordobservation(){
        return this.observcount++;
    }
    
    
   /*public void printall(){
       for(String bir : Bird){
        this.toString();
       }
    }*/
    
    public String toString(){
        
            return this.name + "(" + this.Latinname + ")" + this.observcount + "observations" ;
        }
      
}
