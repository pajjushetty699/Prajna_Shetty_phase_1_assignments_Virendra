package exercise;

public class CustomException {
	static void validate(int salary)throws InvalidAgeException{  
	     if(salary<2100)  
	      throw new InvalidAgeException("you need to work hard");  
	     else if(salary>=2100 && salary<=5000)
	    	 System.out.println("you salary is somehow good");
	     else if(salary>5100 && salary<9000 )
	    	 System.out.println("salary is very good");
	       
	   }

	public static void main(String[] args) {
		try{  
	        validate(3000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  
class InvalidAgeException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){  //2
	  super(s);  
	 }  
  

	}


