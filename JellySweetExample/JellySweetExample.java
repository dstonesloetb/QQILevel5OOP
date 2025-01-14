package com.mycompany.JellySweetExample;

public class JellySweetExample {

    public static void main(String[] args) {
        //Create a Jelly object using the five argument constructor
        Jelly j1 = new Jelly("Haribo", 1.2f, Flavour.MINT, 300f, "31/12/2025");
        
        //Display the first jelly using the toString method
        System.out.println(j1.toString());
                  
        
    } //end main
} //end class 
