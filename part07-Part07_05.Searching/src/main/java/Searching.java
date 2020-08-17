
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            int index = Integer.valueOf(scanner.nextLine());
            String bookname = scanner.nextLine();
            books.add(new Book(index, bookname ));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        //Collections.sort(books);
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        
        for(int i = 0;i< books.size();i++){
            //System.out.println("hhhh " + books.get(i).getId());
            if(books.get(i).getId() == searchedId){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
         int begin = 0; // the 0th index of the list (i.e, the first index of the list)
         int end = books.size()-1;
         
         while((begin <= end)){
             
             int middle = (int)(end + begin) / 2;
             //System.out.println("middle is " + middle + "begin is " + begin + "end is " + end);
             if(books.get(middle).getId() == searchedId){
                 return middle;
             }else if(books.get(middle).getId() < searchedId){
                 //middle+= 1;
                 begin = middle+1;
                 //end = books.size()-1;
             }else if(books.get(middle).getId() > searchedId){
                 end = middle-1;
                 //begin = 0; 
             }
             
             
         }
        System.out.println("hkhkhkhkh");
        
        return -1;
    }
}

