/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

/**
 *
 * @author kms080
 */
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cents = 94;
        int quarters = cents/25;
        int dimes = (cents-(quarters*25))/10;
        int nickels = (cents-((quarters*25)+(dimes*10)))/5;
        int pennies = cents-((quarters*25)+(dimes*10)+(nickels*5));
        System.out.println(cents + " cents =>\nQuarter(s) " + quarters + "\nDime(s) " + dimes + "\nNickel(s) " + nickels + "\n Penny(s) " + pennies);
        cents = 59;
        quarters = cents/25;
        dimes = (cents-(quarters*25))/10;
        nickels = (cents-((quarters*25)+(dimes*10)))/5;
        pennies = cents-((quarters*25)+(dimes*10)+(nickels*5));
        System.out.println(cents + " cents =>\nQuarter(s) " + quarters + "\nDime(s) " + dimes + "\nNickel(s) " + nickels + "\n Penny(s) " + pennies);
        cents = 19;
        quarters = cents/25;
        dimes = (cents-(quarters*25))/10;
        nickels = (cents-((quarters*25)+(dimes*10)))/5;
        pennies = cents-((quarters*25)+(dimes*10)+(nickels*5));
        System.out.println(cents + " cents =>\nQuarter(s) " + quarters + "\nDime(s) " + dimes + "\nNickel(s) " + nickels + "\n Penny(s) " + pennies);
    }
}
