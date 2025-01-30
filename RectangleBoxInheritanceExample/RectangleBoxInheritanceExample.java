package com.mycompany.rectangleboxinheritanceexample;

public class RectangleBoxInheritanceExample {

    public static void main(String[] args) {
        System.out.println("Rectangle Box Inheritance Example");
        
        //Create Rectangle object calling
        //the default no argument constructor 
        Rectangle r1 = new Rectangle();
        
        // Test that the setter methods are working 
        // r2.setWidth(10.5f);
        // r2.setLength(20.25f);
        
        //Display rectangle 1 
        System.out.println("Rectangle 1: ");
        System.out.println("-------------");
        System.out.println(r1.toString());
        
        //Calculate the area of rectangle 1
        System.out.println("Area of rectangle 1: "
                +Float.toString(r1.getArea()));
        
        System.out.println("\n");
        
        
        //Create Rectangle object calling
        //full argument constructor 
        float r2Width = 10.5f;
        float r2Length = 20.25f;
                
        Rectangle r2 = new Rectangle(r2Width, r2Length);
        
        //Display rectangle 2 
        System.out.println("Rectangle 2: ");
        System.out.println("-------------");
        System.out.println("Width: "+r2.getWidth());
        System.out.println("Width: "+r2.getLength());
        
        //Calculate the area of rectangle 2
        System.out.println("Area of rectangle 2: "
                +Float.toString(r2.getArea()));
        
        //Create a box of width 10, length 20, height 30
        //could create vars for w,l,h and pass them into
        //the constructor
        //Box b1 = new Box(width, len, height); BETTER PRACTICE 
        
        Box b1 = new Box (10, 20, 30);
        
        //Display box 1 
        //At this point we don't have a toString function in the
        //Box class
        // so when we call the toString function it is being
        //inherited from the RECTANGLE SUPER CLASS 
        
        System.out.println("\nBox 1:");
        System.out.println(b1.toString());
        
        //Display the volume of box 1
        
        System.out.println("Volume of box 1: "+b1.getVolume());
        
        
        //Create Box Objects
        //Box b1 = new Box();
        
    } //end main 


}//end class
