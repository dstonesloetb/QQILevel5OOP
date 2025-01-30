package com.mycompany.rectangleboxinheritanceexample;

 
//Box class is a child/sub class of
//the Rectangle super/parent class
//all of the properties/behaviours
// of the Rectangle superclass are INHERITED
//by the Box subclass
//Class Declaration
//the extends keyword in java implements
//the inheritance relationship 
public class Box extends Rectangle {

    //instance variable
    //no need to include length and width
    //as these are inherited from
    //the rectangle class 
    private float height;

    //Constructors 
    //Full argument constructor 
    public Box(float width, float length, float height)
    {
        //invoking the super class constructor
        //passing width and length to the
        //Rectangle constructor 
        super(width, length);
        this.height = height;
    }
    
    //No argument constructor 
    public Box()
    {
        //invoke the super class constructor 
        //i.e. Rectangle no args constructor 
        super();
        this.height = 0.0f;
    }
        
    /**
     * @return
     */
    public float getVolume() {
        // volume = width*length*height
        // vol = getArea() * height 
        //float volume = width * length * height; 
       //WORKS -- float volume = super.getWidth() *
       //         super.getLength()  * height;
       
       float volume = super.getArea() * height;
              
        return volume;
    } //end getVolume

//    @Override
//    public String toString() {
//        return "Box{" + "height=" + height + '}';
//    }
    
      //Box sub class toString method is
    // going to override the INHERITED
    //tostring method from the Rectangle super class 
    //AT OVERRIDE ANNOTATION - Tells the compilier
    //this function supercedes the inherited toString 
    //method 
      @Override
     public String toString()
     {
         //super.toString() calls the RECTANGLE
         //Parent class toString() method and
         //then add on the unique info 
         return super.toString()+"\nHeight: "+height;
     }
    

} //end class 
