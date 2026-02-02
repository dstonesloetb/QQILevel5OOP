package human;

import java.util.Scanner;

public class HumanTester {
    
    public static void main(String[] args) {
       
        //initialise variables and objects 
        Scanner in = new Scanner(System.in);
        int age = 0;     
        
        // *********  Ask for Human's Age    ********* 
        
        System.out.print("Please enter the age"
                + " of the human: ");
               
        age = in.nextInt();
                
        // *********  Baby    ********* 
        if (age <=2)
        {
           Baby gillian = new Baby("Gillian Taylor",age,"Female",
           0.6f, 1.0f,true);
            System.out.println("\n"+gillian.toString());
			//override sleep method in Baby
            System.out.println("\n"+gillian.sleep());        
            System.out.println(gillian.swim());
        }
        
        // *********   Child     ********* 
        
        else if (age<18)
        {
            Child frank = new Child("Frank Davis",age, "Male",
            1.5f, 3.0f, "N/A");
            
            System.out.println("\n"+frank.toString());
            
              //inherited from Human
            System.out.println("\n"+frank.eat());
             //override swim method in Child 
            System.out.println(frank.swim());
        }
        
        // *********   Adult     ********* 
        
        else if (age>=18){
            
            Adult billy = new Adult("Billy White", age, "Male",
            6.5f, 11.0f, "564561F", "Software Developer",true,true);
            
            System.out.println("\n"+billy.toString());
            System.out.println("\n" +billy.drive());
            System.out.println(billy.eat());
           
          }
        
         // *********  Error    ********* 
        
        else 
        {
            System.out.println("error with human generation!");
        } //if 
           
    } //main  
} //class 
