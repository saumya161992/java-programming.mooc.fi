/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Saumya Nagia
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    //private double maximumHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
        //this.maximumHeartRate = 0;
    }
    
   /* public double getmaximumHeartRate(){
        //System.out.println("ageee" + this.age);
        this.maximumHeartRate = 206.3 - (0.711 * this.age) ;
        return this.maximumHeartRate;
        //System.out.println( "llllll" + this.maximumHeartRate);
                //206.3 - (0.711 *  (this.age * 1.0));
    }*/
    
    public double targetHeartRate(double percentageOfMaximum) {
        //(maximum heart rate - resting heart rate) * (target heart rate percentage) + resting heart rate
        //System.out.println("jjj" + this.maximumHeartRate);
        return ((206.3 - (0.711 * this.age)) - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;
    }
    
}
