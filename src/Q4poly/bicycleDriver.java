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
public class bicycleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 4 Polymorphism");
        
        Bicycle b= new Bicycle("no", 20);
        System.out.println(b);
        
        Hero h = new Hero("2 Years","Yes", 40);
        System.out.println(h);
        
        Bicycle b1 = new Hero("1 year","Yes",50);
        
    }
    
}
