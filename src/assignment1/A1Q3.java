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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much will the food cost?");
        double food = input.nextDouble();
        
        System.out.println("How much will the DJ cost?");
        double dj = input.nextDouble();
        
        System.out.println("How much will the hall rental cost?");
        double hall = input.nextDouble();
        
        System.out.println("How much will the decorations cost?");
        double deco = input.nextDouble();
        
        System.out.println("How much will the wait staff cost?");
        double staff = input.nextDouble();
        
        System.out.println("How much will the miscellaneous items cost?");
        double misc = input.nextDouble();
        
        double total = food + dj + hall + deco + staff + misc;
        System.out.println("The prom will cost $" + total + ".");
        
        double tickets = total/35;
        tickets = Math.ceil(tickets);
        System.out.println("You must sell " + tickets + " in order to break even");
        
        
    }
}
