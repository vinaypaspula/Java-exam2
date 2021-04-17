/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("Vinay Kumar Paspula\nQuestion 3\n************");

        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan("US Bank","Education",10000, 6, 12.5);
        list.add(loan);

        Date date = Calendar.getInstance().getTime();
        list.add(date);

        String name = "This is a a string";
        list.add(name);

        Circle circle = new Circle(5.5);
        list.add(circle);

        for (Object o : list) {
            System.out.println(o.toString());
        }

    }

}