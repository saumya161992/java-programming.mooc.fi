
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0 ;i < number ;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 0 ;i < number ;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int col = size-1;
        for(int i = 1 ;i <= size ;i++){
            for( int j = 1 ; j<=col; j++){
                System.out.print(" ");
            }
            col = col-1;
            for(int k = 1;k<=i ;k++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
        //System.out.println("");
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int col = height-1;
        int val = col;
        for(int i = 1 ;i <= height ;i++){
            for( int j = 1 ; j<=col; j++){
                System.out.print(" ");
            }
            col = col-1;
            for(int k = 1;k<=i ;k++){
                System.out.print("*");
            }
            for(int m=2;m<=i;m++){
                System.out.print("*");
            }
            
            
            
            System.out.println("");
        }
        //System.out.println("");
        
        for(int p=1 ;p<=height-2 ;p++){
            System.out.print(" ");
        }
        for(int w=height-1;w<=height+1;w++){
            System.out.print("*");
        }
        System.out.println("");
        for(int p=1 ;p<=height-2 ;p++){
            System.out.print(" ");
        }
        for(int w=height-1;w<=height+1;w++){
            System.out.print("*");
        }
        
        System.out.println("");
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        
        printStars(4);
        System.out.println("\n---");
        printSpaces(4);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
        christmasTree(4);
        System.out.println("\n---");
        //christmasTree(10);
    }
}
