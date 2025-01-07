package com.mycompany.caroopexample;

public class CarOOPExample {

    public static void main(String[] args) {
        //Create a car object from the class blueprint
        Car c1 = new Car();
        
        c1.manufacturer = "Ford";
        c1.model = "Ka";
        c1.travelSpeed = 85.25f;
        c1.topSpeed = 180.20f;
        c1.fuelType = "petrol";
        c1.noOfSeats = 5;
        
        System.out.println("Car 1 Manufacturer: "
                + c1.manufacturer);
        System.out.println("Car 1 Model: "
                + c1.model);
        System.out.println("Car 1 Travel Speed: "
                + c1.travelSpeed);
        System.out.println("Car 1 Top Speed: "
                + c1.topSpeed);
        System.out.println("Car 1 No Of Seats: "
                + c1.noOfSeats);
        
        c1.beep();
        c1.brake();
        c1.brake();
        
        System.out.println(c1.travelSpeed);
        
        System.out.println("");
        
        //*****
        
        
         //Create a car object from the class blueprint
        Car c2 = new Car();
        
        c2.manufacturer = "Toyota";
        c2.model = "Corolla";
        c2.travelSpeed = 85.25f;
        c2.topSpeed = 180.20f;
        c2.fuelType = "diesel";
        c2.noOfSeats = 6;
        
        System.out.println("Car 2 Manufacturer: "
                + c2.manufacturer);
        System.out.println("Car 2 Model: "
                + c2.model);
        System.out.println("Car 2 Travel Speed: "
                + c2.travelSpeed);
        System.out.println("Car 2 Top Speed: "
                + c2.topSpeed);
        System.out.println("Car 2 No Of Seats: "
                + c2.noOfSeats);
        
        c2.beep();
        c2.brake();
        c2.brake();
        
        System.out.println(c2.travelSpeed);
        
        System.out.println("");
        
        
        
    } //end main
} //end class
