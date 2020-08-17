
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
         int a = addition.euros + this.euros;
         int b = addition.cents + this.cents;
       
        Money newMoney = new Money(a,b); // create a new Money object that has the correct worth

    // return the new Money object
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public boolean lessThan(Money compared){
         boolean a =true;
         
        if(this.euros < compared.euros){
            a= true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
             
            a = true;
        }else if(this.euros == compared.euros && this.cents > compared.cents){
            a = false;
        }else if(this.euros > compared.euros ){
            a =  false;
        }
             
        
        return a ;
    }
    
    public Money minus(Money decreaser){
        int euro = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;
        
        if (cent < 0) {

            cent += 100;

            euro -= 1;

        }

        

        if (euro < 0) {

            return new Money(0,0);

        }
        
        Money newMoney = new Money(euro,cent);
        
        return newMoney; 
    }

}
