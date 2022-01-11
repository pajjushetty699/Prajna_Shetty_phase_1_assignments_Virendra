package exercise;

class Product1 {
	int id=78;
	String name="Amul";
	void display(){
		System.out.println(id+" "+name);
	}
}
class A extends Product1{
	int count=50;
	String category="butter";
	void display(){
		System.out.println(id+" "+name+" "+count+" "+category);
	}
}
class B extends Product1{
	int count=90;
	String category="milk";
	void display(){
	      System.out.println(id+" "+name+" "+count+" "+category);
	      }
}
class C extends Product1{
	int count=56;
	String category="choco";
	void display(){
		System.out.println(id+" "+name+" "+count+" "+category);
	}
}
class SubA extends A{
	int price=30;
	void display(){
		int totalprice=(count*price);
	System.out.println(id+" "+name+" "+count+" "+category+" "+totalprice);
	}
}
class SubB extends B{
	int price=10;
	void display(){
		int totalprice=count*price;
		System.out.println(id+" "+name+" "+count+" "+category+" "+totalprice);
	}
}
public class Product{
	
	public static void main(String[] args) {
	SubB ob=new SubB();
	SubA obj=new SubA();
	C obc=new C();
	obc.display();
	ob.display();
	obj.display();
	
	}
}

