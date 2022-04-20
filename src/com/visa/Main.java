package com.visa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];

        for (; true; ) {

            System.out.println("Bank Admin Menu:");
            System.out.println("Please Enter a Menu Option:");
            System.out.println("(1): Add Customer to the Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify Account Balance");
            System.out.println("(5): Summary Of All Accounts");
            System.out.println("(-1): Quit");

            userInput = input.nextInt();
            if (userInput == 1) {
                System.out.println("Bank Add Customer Menu");
                System.out.println("Please Enter an Account Balance");
                double balance = input.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please Enter the Account Name");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("Customer ID is: " + size);
                size = size + 1;

            }
           else if (userInput == 2) {
                System.out.println("Bank Change Name Menu");
                System.out.println("Please Enter a Customer ID to Change Their Name");
                int index = input.nextInt();
                System.out.println("What is the Customer's New Name?");
                input.nextLine();
                accountNames[index] = input.nextLine();

            }
            else if (userInput == 3) {
                System.out.println("Bank Check Balance Menu");
                System.out.println("Please Enter a Customer ID to Check The Balance");
                int index = input.nextInt();
                double balance = accountBalances[index];
                System.out.println("This Customer has $" + balance + " in their Account");

            }
           else if (userInput == 4) {
                System.out.println("Bank Modify Balance Menu");
                System.out.println("Please Enter a Customer ID to Modify Balance");
                int index = input.nextInt();
                System.out.println("Please Enter Your New Balance: ");
                accountBalances[index] = input.nextDouble();

            }
           else if (userInput == 5) {
                System.out.println("Bank All Customer Summary Menu:");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
                }
                System.out.println("In Total ,there is $" + total + " in their bank");

            }
           else if (userInput == -1) {
                System.exit(-1);

            } else {
                System.out.println("ERROR: Invalid Input");
            }
        }
    }
}