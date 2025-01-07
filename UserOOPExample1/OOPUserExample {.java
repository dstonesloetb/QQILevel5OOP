package com.mycompany.oopuserexample;

public class OOPUserExample {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //Create user object 1 
        User u1 = new User();
        
        //Set the properties of the u1 object
        u1.name = "Paddy";
        u1.membership = "Gold";
        u1.age = 21;
        
        System.out.println("Member 1:");
        System.out.println("Name: "+u1.name);
        System.out.println("Membership: "+u1.membership);
        System.out.println("Age: "+u1.age);
        
        //Create user object 2
        User u2 = new User();
        
        //Set the properties of the u1 object
        u2.name = "Sally";
        u2.membership = "Silver";
        u2.age = 23;
        
        System.out.println("\nMember 2:");
        System.out.println("Name: "+u2.name);
        System.out.println("Membership: "+u2.membership);
        System.out.println("Age: "+u2.age);
        
        
    } //end main 
} //end class 
