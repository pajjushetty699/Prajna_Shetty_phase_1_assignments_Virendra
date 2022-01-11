package home.exercise;

public class Student {
          String name;
          Student(String n){
        	  name=n;
          }
          Student(){
        	name="unkown";  
          }
          void display(){
        	System.out.println(name);  
          }
	public static void main(String[] args) {
		Student s=new Student("wwe");
		Student s1=new Student();
             s.display();
             s1.display();
	}

}
