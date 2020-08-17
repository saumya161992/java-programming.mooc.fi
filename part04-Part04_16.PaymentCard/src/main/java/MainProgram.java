
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("paul: " + paulsCard);
        System.out.println("matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        
        mattsCard.eatHeartily();
        
        System.out.println("paul: " + paulsCard);
        System.out.println("matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);
        System.out.println("paul: " + paulsCard);
        System.out.println("matt: " + mattsCard);
        
        /*PaymentCard card = new PaymentCard(50);
        System.out.println(card);
        
        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);*/

    }
}
