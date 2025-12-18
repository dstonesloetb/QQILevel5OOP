package com.mycompany.librarybook;

// ** Update comment below **

/**
 * Program:  LibraryBook Class
 * @author Student
 * Date: 
 */

import java.util.Scanner;

public class LibraryBook {

    // ** insert comment here **
   // ** Insert relevant code here **

    // ----- Constructor -----
    // ** Insert comment **
    // ** Insert relevant code here **

  
    // ----- Methods -----

    // Add copies to stock
    public void addCopies(int amount) {
        // ** Insert relevant code here **
    }

    // Borrow copies if available
    // ** insert additional explanatory comment here 
    public void borrowBook(int amount) {
        // ** Insert relevant code here **
      
    }

    // Display current number of copies
    // ** Insert relevant code here **
        System.out.println("Current copies of \"" + title + "\": " + copies);
    

    // ----- Main Program -----
    public static void main(String[] args) {

        //Declare and create a scanner object
         // **insert relevant code here **

        // Create a LibraryBook object
        // **insert relevant code here **

        //Users choice for the menu
        int choice;


        //Display menu and 
        //get process user's choice 
        // ** Start repeated block of code - insert relevant code here  **

            // Display menu
            System.out.println("\n===== LIBRARY MENU =====");


      
            //Get user's choice 
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            //Process menu choice 
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to add: ");
                    int addAmount = input.nextInt();
                    book.addCopies(addAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to borrow: ");
                    // **insert relevant code here ** 
                    break;

                case 3:
                    book.checkCopies();
                    break;

                case 4:
                    //Exit program 
                    break;

                default:
                    //Invalid choice 
            }

        //** end repeated block of code - insert relevant code here   **


        input.close();
    } //end main method
    
} //end class

