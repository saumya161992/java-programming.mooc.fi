import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Film {
    
    private String name;
    private int ageRating;
    
    public Film(String filmName, int filmAgeRating){
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }
    
    public String name(){
        return name;
    }
    public int ageRating(){
        return ageRating;
    }
    
    
    public static void main(String[] args){
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        }else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }

    }
}
