/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Driver {

    public static void main(String[] args) {
    One hippo = new Three();
    System.out.println(hippo.guess(4));
    System.out.println(hippo.apply(12));

    One lion = new One(-1);
    System.out.println(lion.guess(5));
    System.out.println(lion.apply(6));        
} // end

    
}
