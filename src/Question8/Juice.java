/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Vinay Kuamr Paspula
 */
public abstract class Juice {
    private double price;
    private int boxSize;

    public Juice(double price, int boxSize) {
        this.price = price;
        this.boxSize = boxSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }

    public abstract Boolean isPulpi();
    public abstract Boolean isSweet();
    
    
}
