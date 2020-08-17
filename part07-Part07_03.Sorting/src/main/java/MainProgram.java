
import java.util.Arrays;
public class MainProgram {
    
    public static int smallest(int[] array){
    // write your code here
    int temp = array[0];
    for(int i = 1;i< array.length;i++){
        if(array[i] < temp){
            temp = array[i];
        }
       
    }
    return temp;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
    // write your code here
     int index = startIndex;
    int temp = table[index];
    for(int i = index + 1;i< table.length;i++){
        if(table[i] < temp){
            temp = table[i];
            index = i;
        }
       
    }
    return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // write your code here
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
            
        
    }
    
    
    public static int indexOfSmallest(int[] array){
    // write your code here
    int temp = array[0]; int index = 0;
    for(int i = 1;i< array.length;i++){
        if(array[i] < temp){
            temp = array[i];
            index = i;
        }
       
    }return index;
    }
    
    public static void sort(int[] array) {
    
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length ;i++){
             int index = indexOfSmallestFrom(array,i);
             swap(array,i,index);
             System.out.println(Arrays.toString(array));
        }
        
            
    }

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

}
