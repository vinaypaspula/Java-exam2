/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9_example2;

/**
 *
 * @author Vinay Kumar Paspula
 */

public class Circle implements Polygon{

    @Override
    public double Area() {
        return Math.PI*RADIUS*RADIUS;
    }

    @Override
    public double Perimeter() {
        return 2*Math.PI*RADIUS;
    }
    
}
