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
public class Bicycle {
    
    private String Gears;
    private int maxSpeed;

    public Bicycle(String Gears, int maxSpeed) {
        this.Gears = Gears;
        this.maxSpeed = maxSpeed;
    }

    public String getGears() {
        return Gears;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setGears(String Gears) {
        this.Gears = Gears;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double price(){
        return 200;
    }
    
    public boolean isElectric(){
        return false;
    }

    @Override
    public String toString() {
        return  "Gears=" + Gears + ", maxSpeed=" + maxSpeed+ ", is electric= "+ isElectric();
    }
    
}