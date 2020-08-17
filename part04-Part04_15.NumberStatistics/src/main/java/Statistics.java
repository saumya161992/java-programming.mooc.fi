
public class Statistics {
    
    private int count;
    private int sum;
    
    
    //private int average;
    
    public Statistics(){
        
        this.count = 0;
        this.sum = 0;
       
    }
    
    public void addNumber(int number) {
        // write code here
        this.sum = this.sum + number;
        this.count = this.count +1;
        //this.average = this.sum/this.count;
    }
    
   
    
   

    public int getCount() {
        // write code here
        
        return this.count;
    }
    
     public int sum() {
        // write code here
        return this.sum;
    }
     
    
     public double average() {
        // write code here
        if(count == 0){
            return 0;
        }else{
            return (1.0*this.sum)/this.count;
        }
    }
}
