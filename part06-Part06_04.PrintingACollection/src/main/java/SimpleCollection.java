
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String collection = "";
        
        if (elements.isEmpty()) {
            return  "The collection " + this.name + " is empty.";
        }

        for (String element : elements) {
            collection = collection + "\n"  + element;
        }
        
        if(elements.size() == 1){
            collection = "The collection "+ this.name+ " has " + elements.size() + " element:" + collection;
        }else if(elements.size() > 1){
        collection = "The collection "+ this.name+ " has " + elements.size() + " elements:" + collection;
        }
        return collection;

    }
    
}
