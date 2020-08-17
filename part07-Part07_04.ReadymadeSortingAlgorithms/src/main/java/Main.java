import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    
    public static void sort(int[] array){
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            
    }
    
    public static void sort(String[] array){
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        
        Collections.sort(integers);
        System.out.println(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
     Collections.sort(strings);
        System.out.println(strings);   
    }


    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        Main.sort(array);
        String[] array1 = {"sau","ind","amer"};
        Main.sort(array1);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        System.out.println(numbers);
        sortIntegers(numbers);
        
        
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("yellow");
        str.add("pink");
        str.add("white");
        System.out.println(str);
        sortIntegers(numbers);
        sortStrings(str);


        
    }

}
