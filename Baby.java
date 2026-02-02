package human;

public class Baby extends Human {

    //instance variables 
    private boolean isTeething;
    
    //constructors 
    public Baby(String name, int age, String gender, float height, float weight,
               	boolean isTeething) {
        super(name, age, gender, height, weight);
        this.isTeething = isTeething;
    }
    
    public Baby(String name, int age, String gender, float height, float weight) {
        super(name, age, gender, height, weight);
    }
        
      public Baby()
      {

      }
      

      //setter and getter methods
     public boolean getIsTeething() {
        return isTeething;
    }

    public void setIsTeething(boolean isTeething) {
        this.isTeething = isTeething;
    }
      
    
    //additional methods 
      
      @Override
    public String swim() {
        return "A baby cannot swim safely...";
    }
  
    
    //use the human super class sleep method
    @Override
    public String sleep() {
        
        if (isTeething)
        {
            return "Baby having difficulty sleeping due to a teething pain.";
        }
        
        else
        {
            return super.sleep();
        }
    }

    
  // to string method 

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Baby is Teething: " +isTeething;
    }
} //end class
