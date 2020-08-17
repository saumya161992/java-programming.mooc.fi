import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
        



public class RecipeSearch {

    public static void main(String[] args) {
        
        //ArrayList<String> readline = new ArrayList(); 
        RecipeBook book = new RecipeBook();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String Filename = scanner.nextLine();
        
       
        try (Scanner filereader = new Scanner(Paths.get(Filename))){
            
            while (filereader.hasNextLine()){
                String recipename = filereader.nextLine();
               //readline.add(line);
                //String recipename = readline.get(0);
                int recipetime = Integer.valueOf(filereader.nextLine());
                recipe rec1 = new recipe(recipename,recipetime);
                //book.addRecipe(rec1);
                
                
       
                while(filereader.hasNextLine()){
                    String ingredients = filereader.nextLine();
                    if(ingredients.isEmpty()){
                        break;
                    }else{
                        rec1.addIngredients(ingredients);
                       
                    }
                    
                }    
                book.addRecipe(rec1);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        System.out.println("Commands:" + "\n" + "list - lists the recipes" + "\n" + "stop - stops the program" + "\n" + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n");
        
        while(true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("list")){
                System.out.println("Recipes:");
                System.out.println(book.toString());
            }else if(command.equals("find name")){
                   System.out.println("Searched word:");
                   String word = scanner.nextLine();
                   book.search(word);
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int maxtime = Integer.valueOf(scanner.nextLine());
                book.searchbytime(maxtime);
            }else if(command.equals("find ingredient")){
                String ingred = scanner.nextLine();
                 book.searchbyingredient(ingred);
                
            }
                
                
            }
            
        }
    }
    



