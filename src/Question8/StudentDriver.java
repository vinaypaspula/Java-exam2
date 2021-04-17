/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Vinay Kumar Paspula - Question 8 example 1");
        Student ol= new Online("Vinay", "Kumar");
        System.out.println(ol);
        System.out.println("Type of study: "+ol.type());
        Student stud1 = new Fulltime("Vinay", "Paspula");
        System.out.println(stud1);
        System.out.println("Credits required: "+stud1.credits()); 
  }
    
}