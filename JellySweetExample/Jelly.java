package com.mycompany.JellySweetExample;

public class Jelly {
//Instance variables
  private String manufacturer;
  private float price;
  private Flavour flavour;
  private float noOfCalories;
  private String expiryDate;
    
  // Constructors      
  // Constructor with five arguments
  public Jelly(String manufacturer, float price, Flavour flavour, float noOfCalories, String
    expiryDate){
    this.manufacturer = manufacturer;
    this.price = price;
    this.flavour = flavour;
    this.noOfCalories = noOfCalories;
    this.expiryDate = expiryDate;
  }
    
    // Constructor with four arguments
  public Jelly(String manufacturer, float price, Flavour flavour, float noOfCalories){
    this(manufacturer,price,flavour,noOfCalories,"not specified");
  }
    
    // Constructor with three arguments
  public Jelly(String manufacturer, float price, Flavour flavour) {
    this(manufacturer,price,flavour,0.0f,"not specified");
  }
    
    // Constructor with two arguments
  public Jelly(String manufacturer, float price){
    this(manufacturer,price,Flavour.NONE,0.0f,"not specified");
  }
    
  // Constructor with one argument
  public Jelly(String manufacturer){
    this(manufacturer,0.0f,Flavour.NONE,0.0f,"not specified");
  }
    
  // Constructor with no arguments
  public Jelly(){
    this("not specified",0.0f,Flavour.NONE,0.0f,"not specified");
  }
    
  // Setters and Getters go here
  public void setManufacturer(String manufacturer){ 
    this.manufacturer = manufacturer; 
  } 
    
  public String getManufacturer(){
    return manufacturer; 
  }
    
  public void setPrice(float price){
    this.price = price; 
  }
    
  public float getPrice(){ 
    return price; 
  } 
        
  public void setFlavour(Flavour flavour){    
    this.flavour = flavour;    
  } 
    
  public Flavour getFlavour(){    
    return flavour;    
  }   
    
  public void setNoOfCalories(float noOfCalories){     
    this.noOfCalories = noOfCalories;    
  }   
    
  public float getNoOfCalories(){    
    return noOfCalories;    
  }       
    
  public void setExpiryDate(String expiryDate){  
    this.expiryDate = expiryDate;    
  }      
    
  public String getExpiryDate(){   
    return expiryDate;    
  }      
    
// Methods   
  public String setInstructions(){   
    return "Leave Jelly to set in a cool environment for 1hr";   }

// To String method - display Jelly
  public String toString(){      
    return "Manufacturer: " + manufacturer + 
               "\n" + "Price: " + price + "\n" + "Flavour: " + 
               flavour + "\n" + "No. of Calories: " + noOfCalories  
               + "\n" + "Expiry Date: " + expiryDate;   
 
  }// toString
    
} //class 
