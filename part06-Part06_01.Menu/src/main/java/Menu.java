
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    
    public void addMeal(String meal) {
            //adds a meal to the menu. If the meal is already on the list, it should not be added again.
        if(!meals.contains(meal)){    
            this.meals.add(meal);
        }    
    // implement the required methods here
    }
    
    public void printMeals(){
        
       
        
        for (String meal: this.meals) {
           System.out.println(meal);
        }
    }
    
    public void clearMenu(){
         meals.removeAll(meals);
         //for(int i = 0; i < meals.size() ;i++ ){
        
        //this.meals.remove(i);
        //}   
        
    }
}
