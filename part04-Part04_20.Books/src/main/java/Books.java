/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Books {
    
    private String title;
    private String pages;
    private String publicationyear;
    
    public Books(String title,String pages,String publicationyear){
        this.title = title;
        this.pages = pages;
        this.publicationyear = publicationyear;
    }

     public String gettitle(){
         return this.title;
     } 
     
     public String getpages(){
         return this.pages;
     }
     
     public String getpublicationyear(){
         return this.publicationyear;
     }
     
     public String toString(){
      
         return this.title + "," + this.pages + "," + this.publicationyear;
     }
}
