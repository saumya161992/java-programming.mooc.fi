
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
    
    public String longest(){
        
        if(elements.size() ==0){
            return null;
        }
        String returnObject = this.elements.get(0);
        for(String str : elements){
            if(str.length() > returnObject.length()){
                returnObject = str;
            }
        }
        return returnObject;
    }

}
