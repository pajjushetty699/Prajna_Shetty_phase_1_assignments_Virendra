package exercise;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class Serealization {

	public static void main(String[] args) throws IOException
	         {
			    Employee obj = new Employee("raju",23,23,"cse","raju@gmail",87846365,'m');
			    Employee obj1=new Employee("suju",22,25,"ise","suju2gmail",6565368,'f');
			    FileOutputStream fos= null;
			    ObjectOutputStream oos= null;
			    
			    try{ 
			      fos = new FileOutputStream("C://Users//theju shetty//Desktop//simplylearn//emplyoee.ser"); 
			      oos = new ObjectOutputStream(fos);
			      oos.writeObject(obj);
			      System.out.println("Serialzation Done!!");
			   }catch(IOException ioe){
			      System.out.println(ioe);
			    }
			    finally{
				      oos.close();
				      fos.close();
			    }
			    Employee o=null;
			    Employee o1=null;
			     try{
			       FileInputStream fis = new FileInputStream("C://Users//theju shetty//Desktop//simplylearn//employee.ser");
			       ObjectInputStream ois = new ObjectInputStream(fis);
			       o = (Employee)ois.readObject();
			       ois.close();
			       fis.close();
			     }
			     catch(IOException ioe)
			     {
			        ioe.printStackTrace();
			        return;
			     }catch(ClassNotFoundException cnfe)
			      {
			        System.out.println("Employee Class is not found.");
			        cnfe.printStackTrace();
			        return;
			      }
		/*	     System.out.println("Employee Name:"+o.getempName());
			     System.out.println("Employee Id:"+o.getempId());
			     System.out.println("Employee Age:"+o.getempAge());
			     System.out.println("Employee DeptName:"+o.getempDeptName());
			     System.out.println("Employee Email:"+o.getempEmail());
			     System.out.println("Employee contact:"+o.getempContact());  */
			  }
			}


class Employee implements java.io.Serializable{
	  
	  private String empName;
	  private int empId;
	  private int empAge;
	  private transient String empDeptName;
	  private String empEmail;  
	  private transient int empContact;  //
	  private char empGender;
	  
	  public Employee(String name, int id, int age, String deptname,String email, int contact,char gender) {
	    this.empName = name;
	    this.empId = id;
	    this.empAge=age;
	    this.empDeptName = deptname;
	    this.empEmail = email;
	    this.empContact = contact;
	    this.empGender=gender;
	    
	    
	  }

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpDeptName() {
		return empDeptName;
	}

	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpContact() {
		return empContact;
	}

	public void setEmpContact(int empContact) {
		this.empContact = empContact;
	}

	public char getEmpGender() {
		return empGender;
	}

	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}

}

