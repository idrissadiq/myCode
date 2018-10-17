package compoundinterest;

/* Idris Sadiq

** 02/19/2017

** This program calculates the annual, monthly, and daily compund interest of a 
   user-defined starting balance, interest rate, and number of years the user 
   will save
*/

import java.util.*;

public class CompoundInterest {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        double startingBalance;
        double interestRate;
        int years;

        System.out.print("Please enter your starting balance: $");
        startingBalance = console.nextInt();
        System.out.println();
        System.out.print("Please enter your yearly interest rate: %");
        interestRate = console.nextInt();
        System.out.println();
        System.out.print("How many years will you be saving: ");
        years = console.nextInt();
        System.out.println();
        System.out.println("Using your starting balance of $" + startingBalance);
        System.out.println("Using your yearly interest rate of " + interestRate + "%");
        System.out.println("Using " + years + " years of saving");
        System.out.println();
        System.out.println("| year | yearly  | monthly |  daily  |");
       
        double newInterestRate = (interestRate/100);
        for (int i = 1; i <= years; i++){
            double yearlyAmt = (startingBalance * Math.pow((1 + (newInterestRate/1)), i));
            double monthlyAmt = (startingBalance * Math.pow((1 + (newInterestRate/12)), (12*i)));
            double dailyAmt = (startingBalance * Math.pow((1 + (newInterestRate/365)), (365*i)));
            System.out.format("|%6d|$%.2f  |$%.2f  |$%.2f  |\n", i, yearlyAmt, monthlyAmt, dailyAmt);
        }
    }
}
