
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        //Account artosAccount = new Account("Arto's account", 100.0);
        //Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);
        Account artonew = new Account("Arto's account in America" ,100.0);

        System.out.println("Initial state");
        //System.out.println(artosAccount);
        //System.out.println(artosSwissAccount);
        System.out.println(artonew);

        //artosAccount.withdrawal(20);
        //System.out.println("The balance of Arto's account is now: " + artosAccount.balance());
        //artosSwissAccount.deposit(200);
        //System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.balance());
        artonew.deposit(20.0);
        System.out.println("The balance of Arto's other account in America is now: " + artonew);


        System.out.println("End state");
        //System.out.println(artosAccount);
        //System.out.println(artosSwissAccount);
        System.out.println(artonew);
    }
}
