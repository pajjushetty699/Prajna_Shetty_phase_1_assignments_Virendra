package exercise;

public class Calculate {
	public int addition(int a,int b){
		System.out.println("add two numbers "+(a+b));
		return a+b;
	}
	public float area(float r){
		System.out.println("area of circle "+(3.14*r*r));
		return r;
		
	}
	public int area(int w,int l){
		System.out.println("area of rectangle "+(w*l));
		return w*l;
	}

	public static void main(String[] args) {
		Calculate obj= new Calculate();
obj.addition(4,5);
obj.area(3);
obj.area(5,6);
	}

}
