/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Door {
    
    
    public void knock(){
        System.out.println("Who's there?");
    }
    public static void main(String[] args) {
        
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }
    
}
