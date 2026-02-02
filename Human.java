package human;
public class Human {

    //instance variables 
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;
    
    //constructors
    public Human(String name, int age, String gender, 
				float height, float weight)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;              
    }
    
        public Human ()
    {
        
    }
    
        //setter and getter methods 


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    

    //additional methods 
    public String sleep() {
        return "Sleeping soundly...";
    }

    public String eat() {
        return "Eating slowly and chewing carefully...";
    }

    public String swim() {
        return "Arms rotating and pushing the body forward.";
    }

    //to string method 
    
    public String toString() {
        return "Name: " +name
                +"\nAge: "+ age
                +"\nGender: "+gender
                +"\nHeight: " +height
                +"\nWeight: " +weight;
    }  
    
} //end class
