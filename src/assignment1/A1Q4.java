/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author simmg9723
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10");
        int number = input.nextInt();

        if (number <= 10 && number >= 1) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }else{
            System.out.println("Invalid number.");
        }
    }
}
