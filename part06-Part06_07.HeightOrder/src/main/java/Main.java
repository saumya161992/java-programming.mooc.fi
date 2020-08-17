
public class Main {

    public static void main(String[] args) {
        // Test your class here
        
        Room room1 = new Room();
        //System.out.println("Shortest: " + room1.shortest());
        //System.out.println("Shortest: " + room1.shortest());
        System.out.println("Empty room? " + room1.isEmpty());
        
        room1.add(new Person("Lea", 183));
        room1.add(new Person("Kenya", 182));
        room1.add(new Person("Auli", 186));
        room1.add(new Person("Nina", 172));
        room1.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room1.isEmpty());

        System.out.println("");
        for (Person person : room1.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room1.shortest());
        System.out.println("");
        for (Person person : room1.getPersons()) {
            System.out.println(person);
        }
        
    }
}
