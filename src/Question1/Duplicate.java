/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Vinay Kumar Paspula
 */
public class Duplicate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Vinay Kumar Paspula\nQuestion 1");
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }

        removeDuplicate(list);

        System.out.print("The distinct integers are ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int d = 0; d < 10; d++) {
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (Objects.equals(list.get(i), list.get(j))) {
                        list.remove(j);
                    }
                }
            }
        }
    }
}