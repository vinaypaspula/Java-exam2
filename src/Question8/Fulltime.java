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
public class Fulltime extends Student {

    public Fulltime(String fName, String lName) {
        super(fName, lName);
    }
    
    @Override
    public String type(){
        return "Full time";
    }
    
    @Override
    public double credits() {
        return 30;
    }
    
    
}