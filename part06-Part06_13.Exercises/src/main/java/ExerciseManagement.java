import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<String> exercises;
    public ExerciseManagement() {        
        this.exercises = new ArrayList<>();
    }    
    
    
      public ArrayList<String> exerciseList() {        
          return this.exercises;    
      }
      
      public void add(String exercise) {        
          this.exercises.add("New");
      }    
      

}
