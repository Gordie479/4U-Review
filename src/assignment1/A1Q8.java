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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Input initial balance.");
        double money = input.nextDouble();
        System.out.println("Input interest rate in whole percent.");
        double interest = input.nextDouble();
        interest = interest / 100;
        double total = money;
        int year = 0;
        while (money < total*2) {
            money = (1 + interest) * money;
            year++;
        }
        System.out.println("In " + year + " years your money will double.");
        year = 0;
        while (money < 1000000) {
            money = (1 + interest) * money;
            year++;
        }
        System.out.println("In " + year + " years you will have $1million.");
        }
    }