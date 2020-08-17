
import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> values){
        int addition = 0;
        for(int val : values){
            addition = addition + val;
        }
        return addition;
        
    }

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        
        System.out.println(sum(numbers));
    }

}
