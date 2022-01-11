package exercise;

public class Student {
	String name;
	int age;
	char section;
	char gender;
	int subject1;
	int subject2;
	int subject3;
	
	Student(String a,int k,char s,char c,int s1,int s2,int s3){
		name=a;
		age=k;
		section=s;
		gender=c;
		subject1=s1;subject2=s2;subject3=s3;
	}
	public int totalMarks(){
		int t;
		t=subject1+subject2+subject3;
		return t;
	 }
   public int percentage(){
	   int p;
	  return p=(totalMarks()*100)/300;
   }
	public static void main(String[] args) {
		Student s1=new Student("pri",22,'a','f',90,80,88);
		Student s2=new Student("shri",21,'b','f',0,55,45);
		Student s3=new Student("dhurv",23,'c','m',0,56,60);
		Student s4=new Student("proov",24,'d','m',70,75,66);
		System.out.println("marks of student s1 "+s1.totalMarks());
		System.out.println("marks of student s2 "+s2.totalMarks());
		System.out.println("marks of student s3 "+s3.totalMarks());
		System.out.println("marks of student s4 "+s4.totalMarks());
		System.out.println("percentage of student s1 "+s1.percentage());
		System.out.println("percentage of student s2 "+s2.percentage());
		System.out.println("percentage of student s3 "+s3.percentage());
		System.out.println("percentage of student s4 "+s4.percentage());
   }

}
