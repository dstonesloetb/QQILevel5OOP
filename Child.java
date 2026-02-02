package human;

public class Child extends Human {
    
    //instance variables 

    private String schoolCardNo = "N/A";
       
    //constructors 

    public Child(String name, int age, String gender, float height, float weight,
             	String schoolCardNo ) {
        super(name, age, gender, height, weight);
        this.schoolCardNo = schoolCardNo;
    }
       
    
    //constructor calling on human super class
    public Child(String name, int age, String gender, float height, float weight) {
        super(name, age, gender, height, weight);
    }
    
          
    public Child()
    {

    }
         
    //setter and getter methods
      
      
    public String getSchoolCardNo() {
        return schoolCardNo;
    }

    public void setSchoolCardNo(String schoolCardNo) {
        this.schoolCardNo = schoolCardNo;
    }
    
    
    //additonal methods 

    @Override
    public String swim() {
        if (getAge() <= 5)
        {
            return "As the child is 5 years old or younger, armbands must be"
                    + " worn and parental supervision is required. " + super.swim();
        }
        else
        {
            return super.swim();
        }
    }

    
    //toString method 
    
    @Override
    public String toString() {
        return super.toString() + "\nSchool Card No.: " +schoolCardNo;
    }
} //end class
