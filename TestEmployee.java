import java.util.ArrayList;

public class TestEmployee {
  public static void main(String[] args) {
    System.out.println("Process an arrayList example:");

    //Create a list of employee jobs to add to employee object
    ArrayList empJobs = new ArrayList();

    //populate list of jobs
    empJobs.add("Meeting");
    empJobs.add("Preparation");

    //Create employee object 
    Employee e1 = new Employee();

    //Set the jobs for the employee
    e1.setJobs(empJobs);
    
   
    //check list of jobs
    //check employee jobs list isnt empty
    if(e1.getJobs().size()>0){ 
  	
    //store list of employee jobs returned by getJobs getter method in jobs ArrayList 
      ArrayList jobs = (ArrayList)e1.getJobs();
		
	     // process jobs in list one by one
        for(int i=0; i<jobs.size(); i++){

		    // check type of job
           switch(jobs.get(i).toString()){
             case "Meeting":
             System.out.println("Meeting needs to be scheduled"); 
             break;
             case "Appointment":
             System.out.println("App needs to be scheduled"); 
             break;
             case "Preparation":
			       System.out.println("Prep needs to be done");              
             break;
             default:
             System.out.println("Other job needs to be scheduled");   
          } //end switch
        } //end for
    } //end if

  } //end main
} //end class
