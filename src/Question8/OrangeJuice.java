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
public class OrangeJuice extends Juice {

    public OrangeJuice(double price, int boxSize) {
        super(price, boxSize);
    }
    @Override
    public Boolean isPulpi() {
        return true;
    }

    @Override
    public Boolean isSweet() {
        return false;
    }

    @Override
    public String toString() {
        return "Box size= "+super.getBoxSize()+" Price= $"+super.getPrice()+
                " Pulp?= "+isPulpi()+" Sweet?= "+isSweet(); 
    }
    
    
    
}
