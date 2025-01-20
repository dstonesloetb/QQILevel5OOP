package com.mycompany.JellySweetExample;

public class JellySweetExample {

    public static void main(String[] args) {
package com.mycompany.jellyconstructorexample;

import java.util.HashSet;

public class JellyConstructorExample {

    public static void main(String[] args) {
        //Create a Jelly object
        Jelly j1 = new Jelly("Haribo",1.2f,Flavour.MINT,300f,"31/12/2025");
        
        System.out.println("Jelly 1");
        
        //Display the first jelly
        System.out.println(j1.toString());
               
        
        System.out.println("\nJelly 2");
        
        //Create a Jelly with the info in the wrong order
        Jelly j2 = 
        new Jelly("31/12/2025",
                300f,
                Flavour.MINT,
                1.2f,
                "Haribo");
        
        //Display the second jelly
        System.out.println(j2.toString());
        
        
        
        //Create a Jelly with the info in the wrong order
        //with incorrect datatypes 
//        Jelly j3 = 
//        new Jelly(1.2f,           String
//                "31/12/2025",     float
//                Flavour.MINT,     Flavour
//                "Haribo",         float
//                300f);            String 
        
        //Display the second jelly
        //System.out.println(j3.toString());
        
        System.out.println("\nJelly 4");
        
        //Create a Jelly sweet using the no arguments
        //constructor
        Jelly j4 = new Jelly();
        
        //Display j4
        System.out.println(j4.toString());
        
        //Setter methods
        j4.setManufacturer("Chivers");
        j4.setPrice(2.50f);
        j4.setFlavour(Flavour.LEMON);
        j4.setNoOfCalories(2000);
        j4.setExpiryDate("31/12/2024");
        
        //Getter methods
        System.out.println(j4.getManufacturer());
        System.out.println(j4.getPrice());
        System.out.println(j4.getFlavour());
        System.out.println(j4.getNoOfCalories());
        System.out.println(j4.getExpiryDate());
        
        //Set the instructions for Jelly 4
        //The output from setInstructions (a String)
        //is the input to the println() function 
        System.out.println(j4.setInstructions());
        
        
    } //end main
} //end class 
                  
        
    } //end main
} //end class 
