package com.mycompany.bankprogram;

import java.util.Scanner;

/**
 * Program: Bank Program 
 * @author Student Name
 * Date: 
 */
public class BankProgram {
    public static void main(String[] args) {
        
        //Declare and create a scanner object
        Scanner scanner = new Scanner(System.in);
        
        //Declare and instantiate an object of the BankAccount class 
        // **insert relevant code here ** 
        
        //Users choice for the menu
        int choice;

        //Display bank account menu and 
        //get process user's choice 
        // ** Start repeated block of code - insert relevant code here  **
      
            //Display Program Heading
            System.out.println("\nWelcome to Bank of Portlaoise");
            System.out.println("-----------------------------");
            
            System.out.println("Please choose an option from the menu below: ");
            
            // Display menu
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            //Get user's choice 
            choice = scanner.nextInt();

            //Process menu choice 
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: €");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: €");
                    // **insert relevant code here ** 
                
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our bank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice != 4 && choice !=3) {
                account.checkBalance();
            }

        //** end repeated block of code - insert relevant code here   **
        scanner.close();
    }  //end main 
}  //end class 
