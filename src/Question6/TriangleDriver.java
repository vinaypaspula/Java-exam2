/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Vinay Kumar Paspula - Question 6");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for side1: ");
        double s1 = scan.nextDouble();
        System.out.print("Enter value for side2: ");
        double s2 = scan.nextDouble();
        System.out.print("Enter value for side3: ");
        double s3 = scan.nextDouble();
        System.out.print("Enter the color of triangle: ");
        String color = scan.next();
        System.out.print("Isfilled(true/false): ");
        Boolean filled = scan.nextBoolean();
        GeometricObject t = new Triangle(s1, s2, s3, color, filled);
        System.out.println(t);
    }

}
