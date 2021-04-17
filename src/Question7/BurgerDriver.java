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


public class BurgerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        System.out.println("Vinay Kumar Paspula - Question 7 example 1\n");
        for(Burger burger:Burger.values()){
            System.out.println(burger+" burger is of $"+burger.getPrice());
        }
        System.out.println("\n");
        for(Burger burger:Burger.values()){
            System.out.println(burger+" burger is of $"+burger.getPrice()+
                    " Price after tax is: "+burger.priceAfterTax());
        }
    }
    
    
}