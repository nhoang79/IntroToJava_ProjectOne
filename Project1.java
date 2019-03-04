/*
 * Project 1 includes two programs:
 *      1. A program that calculates the tax and tip on a restaurant bill.
 *      2. A program that displays stock transactions of Joe.
 */

// @author Ngan Hoang

import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        
        /*
         * Part One of Project 1: Restaurant Bill.
        */
        
        System.out.println("Restaurant Bill");
        
        //Declare a variety of variables needed to calculate restaurant bills.
        final double TAX_PERCENTAGE = .075;
        final double TIP_PERCENTAGE = .18;
        double mealCharge;
        double taxDue;
        double tipDue;
        double totalBill;
        
        //Ask user to enter charge for meal & reading user's input
        System.out.println("Please enter the charge of your meal. ");
        Scanner keyboard = new Scanner(System.in);
        mealCharge = keyboard.nextDouble();
        
        //To make output easier to read
        System.out.print("\n");
        
        //Calculating tax amount and tip amount and total bill of the meal;
        taxDue = (mealCharge * TAX_PERCENTAGE);
        tipDue = (mealCharge + taxDue) * TIP_PERCENTAGE;
        totalBill = mealCharge + taxDue + tipDue;
        
        
        //Displaying meal charge, tax amount, tip amount and total bill
        System.out.printf("The meal charge is $ %.2f\n", mealCharge);
        System.out.printf("Tip amount is $%.2f\n", tipDue);
        System.out.printf("Tax amount is $%.2f\n", taxDue);
        System.out.printf("Your total bill of the meal is $%.2f\n", totalBill);
        
        //To separate the two programs within Project 1.
        System.out.print("\n\n\n");
        
        /* 
         * Part Two of Project 1: Stock Transaction
        */
        
        System.out.println("Stock Transaction");
        
        //Declare a variety of variables needed for Stock Transactions
        final double NUM_PURCHASED = 1000;
        final double NUM_SOLD = 1000;
        final double PUR_PRICE = 32.87;
        final double SOLD_PRICE = 33.92;
        final double COMMISSION_CHARGE = .02;
        double amtPaid, purCommission;
        double amtSold, soldCommission;
        double profit;
        
        //Calculating amount of money Joe paid for his stocks
        amtPaid = NUM_PURCHASED * PUR_PRICE;
        
        
        //Calculating amount of commission Joe paid when he bought the stocks.
        purCommission = amtPaid * COMMISSION_CHARGE;
        
        
        //Calculating amount of money Joe sold his stocks for.
        amtSold = NUM_SOLD * SOLD_PRICE;
        
        
        //Calculating amount of commission Joe paid when sold his stocks.
        soldCommission = amtSold * COMMISSION_CHARGE;
        
        
        /*Calculating profit that Joe made after
        * selling his stocks and paying the two commission to his broker.
        */
        profit = (amtSold - soldCommission) - (amtPaid + purCommission);
        
        
        //Displaying output
        System.out.printf("The amount Joe paid for the stocks is $%,.2f\n"
                          ,amtPaid);
        System.out.printf("The amount of commission Joe paid his broker"
                           + " when he bought the stock is $%,.2f\n",
                            purCommission);
        System.out.printf("The amount of money Joe sold his stocks for is "
                            + "$%,.2f\n", amtSold);
        System.out.printf("The amount of commission Joe paid his broker"
                           + " when he sold his stocks is $%,.2f\n",
                            soldCommission);
        System.out.printf("The amount of profit Joe made after selling"
                           + " his stock and paying the two commissions"
                           + " to his broker is $%,.2f\n", profit);
        
    }
    
}
