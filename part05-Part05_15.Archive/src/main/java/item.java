/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class item {
    
    private String Identifier;
    private String Name;
    
    public item(String Identifier,String Name){
        this.Identifier = Identifier;
        this.Name = Name;
    }
    
    public String toString(){
            return(this.Identifier + ": " + this.Name);
    }
    
    public boolean equals(Object compared) {

        // if the variables are located in the same position, they are equal

        if (this == compared) {

            return true;

        }

 

        // if the compared object is not of type Bird, the objects are not equal

        if (!(compared instanceof item)) {

            return false;

        }

 

        // convert the object to a Bird object

        item compareditem = (item) compared;

 

        // if the values of the object variables are equal, the objects are, too

        return (this.Identifier.equals(compareditem.Identifier) );

    }
    
    
    
}
