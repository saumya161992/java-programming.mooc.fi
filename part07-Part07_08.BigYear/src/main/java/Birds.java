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
public class Birds {
    
    private ArrayList<Bird> Birds;
    
    public Birds(){
        
        this.Birds = new ArrayList();
    }
    
    public void addobservation(Bird bird){
        
            
            Birds.add(bird);
        
    }
    
    public Boolean search(String findbird){
     Boolean var = false;
        for(Bird bb : Birds){
            if(bb.getname().equals(findbird)){
                var= true;
                bb.recordobservation();
            }else{
                var =  false;
            }
        }return var;
    }
    
    public void searchonebird(String findbird){
     for(Bird bb : Birds){
            if(bb.getname().equals(findbird)) {
                System.out.println(bb.toString());
            }  
    }
    }
    
   
    public String toString(){
        String str = "";
       for(Bird bir : Birds){
            //str= bir.getname() + "(" + bir.getLatinname() + ")" + bir.recordobservation() + "observations" + "\n" ;
            str += bir.toString() + "\n";
        }return str;
    }
    
    
    
}
