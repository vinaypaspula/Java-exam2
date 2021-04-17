/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4poly;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Hero extends Bicycle {
    
    public String timePeriod;

    public Hero(String timePeriod, String Gears, int maxSpeed) {
        super(Gears, maxSpeed);
        this.timePeriod = timePeriod;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }
    
    @Override
    public double price(){
        return 300;
    }

    @Override
    public String toString() {
        return super.toString() + ", timePeriod= " + timePeriod ;
    }
    
    
    
    
}
