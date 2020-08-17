/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saumya Nagia
 */
public class Timer {
    
    
    private ClockHand hundredsecond;
    private ClockHand seconds;

    public Timer() {
        //this.hours = new ClockHand(24);
        this.hundredsecond = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredsecond.advance();

        if (this.hundredsecond.value() == 0) {
            this.seconds.advance();

            /*if (this.minutes.value() == 0) {
                this.hours.advance();
            }*/
        }
    }

    public String toString() {
        return  seconds + ":" + hundredsecond ;
    }
}
    
    
