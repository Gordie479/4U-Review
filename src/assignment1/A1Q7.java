/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author simmg9723
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pop = 6000000;
        int year = 1999;
        
        while (pop < 10000000){
            pop = pop*1.014;
            year++;
        }
        System.out.println("The population will reach 10 billion by the year " + year + " if the population grows by 1.4% per year");
    }
}
