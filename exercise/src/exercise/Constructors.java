package exercise;

public class Constructors {
int a;
float b;
String name;
	
	 Constructors(){
	 }
		 Constructors(String circle,int a,float b){
		 name=circle;
		 		 System.out.println(name+""+(3.14*a*b));

	 }
	 
	 Constructors( String s1,int s){
		 name=s1;
	 }
	 Constructors(String rectangle,int w, int l){
		name=rectangle; 
		 
	 }
	 
	public void areac(int a){
		System.out.println("area of circle "+(3.14*a*a));
	}
	public void area(int s){
		System.out.println("area of square "+(s*s));
	}
	public void area(int w,float l){
		System.out.println("area of rectangle "+(w*l));
		
	}
	public void area1(int d1,int d2){
		System.out.println("area of rhombus "+(d1*d2)/2);
		
	}
	public void area2(int h,int b){
		System.out.println("area of triangle "+(0.5*b*h));
		
	}

	public static void main(String[] args) {
	   Constructors ob=new Constructors();
		Constructors ob1=new Constructors("circle",9,2.5f);
		
		Constructors ob2=new Constructors("square",4);
		Constructors ob3=new Constructors("rectangle",7,8);
		ob.areac(5);
		ob.area(5);
		ob.area(6,9);
		ob.area1(2,2);
		ob.area2(4,4);

	}

}
