/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Vinay Kumar Paspula
 */
public enum Iphone {
    Iphone_12_mini(699, 5.18,2.53,4.76), Iphone_12(799, 5.78, 2.82,5.78), Iphone_12_promax(1199, 6.33,3.07,8.03);
    
    private double price;
    private double Height;
    private double Width;
    private double Weight;

    private Iphone(double price, double Height, double Width, double Weight) {
        this.price = price;
        this.Height = Height;
        this.Width = Width;
        this.Weight = Weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    
   
    
}