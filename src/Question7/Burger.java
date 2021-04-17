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
public enum Burger {
    Veg(5, 2.5), Chicken(7.5, 2), Ham(10, 3), Tuna(12.5, 1.2);
    
    private double price;
    private double taxRate;

    private Burger(double price, double taxRate) {
        this.price = price;
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getPrice() {
        return price;
    }
    
    public double priceAfterTax(){
         return price+(price*taxRate/100);
    }
   
    
}