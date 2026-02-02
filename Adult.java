package human;
public class Adult extends Human {

    //instance variables 
    private String ppsNo;
    private String occupation;
    private boolean isMarried;
    private boolean isCarOwner;
    
    //constructor based on the adult sub class
    //inheriting attributes of human super class
    public Adult (String name, int age, String gender, float height, float weight,
            String ppsNo, String occupation, boolean isMarried, boolean isCarOwner)
    {
        super( name, age, gender, height, weight);
        this.ppsNo = ppsNo;
        this.occupation = occupation;
        this.isMarried = isMarried;
        this.isCarOwner = isCarOwner;
    }   
    
    //constructor based on the super class
    public Adult (String name, int age, String gender, 
	              float height, float weight)
    {
        super(name, age, gender, height, weight);
    }
    
    
 // setter and getter methods 

    public String getPpsNo() {
        return ppsNo;
    }

    public String getOccupation() {
        return occupation;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public boolean getIsCarOwner() {
        return isCarOwner;
    }

    public void setPpsNo(String ppsNo) {
        this.ppsNo = ppsNo;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void setIsCarOwner(boolean isCarOwner) {
        this.isCarOwner = isCarOwner;
    }
        
    //additional methods
    
    public String drive() {
        return "Driving the car safely...";
    }

    public String procreate() {
        return "Procreating...";
    }
    
    //toString method 
    @Override
    public String toString() {
        return super.toString() + "\n" + "Pps No: " +ppsNo
                +"\nOccupation: " +occupation
                +"\nMarriage Status: " +isMarried
                +"\nCar Owner: " +isCarOwner;
                
    }
}//end class
