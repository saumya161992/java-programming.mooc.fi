
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("First name: ");
            String firstname = scanner.nextLine();
            if (firstname.isEmpty()) {
                break;
            }
        
        
            System.out.print("Last name: ");
             String lastname = scanner.nextLine();
        
            System.out.print("Identification number: ");
            String idno = scanner.nextLine();
            //System.out.println(firstname,lastname,idno);
        
            infoCollection.add(new PersonalInformation(firstname,lastname,idno));
            //System.out.println(infoCollection.get(0));
        }
        
        for (int i = 0; i < infoCollection.size(); i++) {
            System.out.println("");
            String output = "";
            output += infoCollection.get(i).getFirstName();
            output += " ";
            output += infoCollection.get(i).getLastName();
            System.out.println(output);
           // System.out.println("");
}
        
        
        //for(PersonalInformation info : infoCollection){
          //  System.out.println(PersonalInformation.get);
        //}

    }
}
