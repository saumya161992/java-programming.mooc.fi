
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        //while(true){
            if(this.day < 30 ){
                this.day = this.day +1;
            }else if(this.month < 12){
                  this.day = 1;
                  this.month = this.month +1;
            }else{
                      this.day = 1;
                      this.month =  1;
                      this.year = this.year + 1;
                      //System.exit(1);
            }
                
          
            
        //}
    }
    
    public void advance(int howManyDays){
        for(int i = 0;i < howManyDays ;i++){
            advance();
        }
    }

    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day,this.month,this.year);

    // do something..
    
        if(newDate.day + days < 30 ){
                newDate.day = this.day +days;
                //System.out.println(newDate.day + "is");
        }else if(newDate.month < 12){
            newDate.day = days;
            newDate.month = this.month +1;
        }else{
            newDate.day = days;
            newDate.month =  1;
            newDate.year = this.year + 1;
                      //System.exit(1);
        }
             
        return newDate;

        
    }
}
