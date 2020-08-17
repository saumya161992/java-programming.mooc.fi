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
public class Room {
    private ArrayList<Person> Roomperson;
    
    public Room(){
        
        this.Roomperson = new ArrayList<>();
    }
    
    public void add(Person person){
        
        this.Roomperson.add(person);
        
       
        
    }
    
    public boolean isEmpty(){
        return this.Roomperson.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.Roomperson;
    }
    
    public Person shortest(){
        
        
        if(this.Roomperson.isEmpty()){
            return null;
        }
        Person shortest = this.Roomperson.get(0);
        
        for(Person per : Roomperson){
            if(shortest.getHeight() > per.getHeight()){
               shortest = per;
            }
        }
        
        return shortest;
        
    }
    
    public Person take(){
         if(this.Roomperson.isEmpty()){
            return null;
        }
         
         Person shortest = this.shortest();
         
         Roomperson.remove(shortest);
        
        return shortest; 
        
    }
}
