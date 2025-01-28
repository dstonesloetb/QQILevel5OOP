package com.mycompany.rectangleboxinheritanceexample;

/*
import java.io.*;
import java.util.*;
*/

/**
 *   Class Declaration 
 */
public class Rectangle {

    /**
     * Instance Variables 
     */
    private float width;
    private float length;
    
    //Constructors
    //Having two or more constructors in the same
    //class is called constructor overloading 
    //Full argument constructor 
    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length; 
    }
    
    //No argument constructor 
    public Rectangle()
    {
        this.width = 0.0f;
        this.length = 0.0f;
    }
    
    
    //Setter and getter methods
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getWidth()
    {
        return this.width;
    }
    
    public void setLength(float length)
    {
        this.length = length;
    }
    
    public float getLength()
    {
        return this.length;
    }
    
    //Other methods - getArea()

    /**
     * @return
     */
    public float getArea() {
        // area = width * length
        float area = width * length;
        return area;
    }
    
    //toString()
    public String toString()
    {
        return "Width: "+width +
                "\nLength: "+length;
    }//to string 
       
} //end class 
