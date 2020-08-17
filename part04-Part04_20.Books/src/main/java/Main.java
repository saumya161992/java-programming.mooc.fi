import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> Bookinfo = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String Title = scanner.nextLine();
            if (Title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            
            System.out.println("Publication year:  ");
            String year = scanner.nextLine();
            Bookinfo.add(new Books(Title, pages,year));
        }
        
        System.out.println("What information will be printed?");
        String Text = scanner.nextLine();
        if(Text.equals("everything")){
            for(int i = 0; i < Bookinfo.size();i++){
                System.out.println(Bookinfo.get(i).gettitle()+ ", "+Bookinfo.get(i).getpages()+" pages, " + Bookinfo.get(i).getpublicationyear());
            }
        }else if(Text.equals("name")){
            for(int i = 0; i < Bookinfo.size();i++){
                System.out.println(Bookinfo.get(i).gettitle());}
            
        }    
    
    }
}


