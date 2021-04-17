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
public class IphoneDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        System.out.println("Vinay Kumar Paspula - Question 7 example 2\n");
        for(Iphone iphone:Iphone.values()){
            System.out.println(iphone+" is of $"+iphone.getPrice()+
                    "\n Height: "+iphone.getHeight()+"\n Weight: "+iphone.getWeight()+"\n Width: "+iphone.getWidth()+"\n");
        }
    }
    
    
}