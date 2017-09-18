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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 50 and 100 to stop at.");
        double number = input.nextDouble();
        int count = 100;
        if (number >= 50 && number <= 100){
            number = number/5;
            number = Math.ceil(number);
            number = number*5;
            while (count >= number){
                System.out.println(count);
                count = count - 5;
            }
        }else{
            System.out.println("Number must be between 50 and 100");
        }
    }
}
