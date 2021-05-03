package firstProject;

public class StudentPc {
	
	    String name;
	    int rollNo;
	    String className;
	    String section;
	    String school;
	    boolean isTheResult;   
	    
	    StudentPc(String name, int rollNo, String className,String section,String school, boolean isTheResult)
	    {
	        this.name = name;
	        this. rollNo = rollNo;
	        this.className = className;
	        this.section = section;
	        this.school = school;
	        this.isTheResult = isTheResult;        
	    }
	    
	    public void studentData()
	    {
	        System.out.println("Name of Student = " + name);
	        System.out.println("Roll no = "+ rollNo);
	        System.out.println("Class Name = "+ className);
	        System.out.println("section= " + section);
	        System.out.println("School = " + school+"\n");
	        
	    }
	    public void  displayProfileOf(String studentName) {
	       if    (studentName == this.name) 
	       {	
	    	    
		        System.out.println("Required Roll no = "+  this.rollNo);
		        System.out.println("Required Class Name = "+ this.className);
		        System.out.println(" Current section= " + this.section);
		        System.out.println(" Studying School = " + this.school+"\n");
		        
	       }else 
	    	   System.out.println("Specified User Not Found");
	    }
	    public boolean isPass()
	    {
	    	if (this.isTheResult)
	    		return true;
	    	else
	    		return false;
	    }
	    
	    public static void main (String args[])
	    {
	             
	        
	        StudentPc student1 = new StudentPc("Ravi", 1, "08","B","SBOA", false );
	        student1.studentData();
	        student1.displayProfileOf("Ravi");
	        
	        
	        StudentPc student2 = new StudentPc("Ram", 2, "10","A","SB", true);
	        student2.studentData();
	        student2.displayProfileOf("Ravi");
	        
            System.out.println("results:\n");
	        System.out.println("Is student pass :"+ student1.isPass());
	        System.out.println("Is student pass :"+ student2.isPass());
	    }
	    
	}
