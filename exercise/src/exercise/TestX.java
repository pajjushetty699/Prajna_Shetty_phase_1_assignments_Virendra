package exercise;

public class TestX {
	private int c=6;
	long b=776;
	protected float f=8.9f;
	char m;
	public void methodPublic(){
		methodPrivate();
	}
	
	protected void methodProtected(){
		methodPrivate();
		
	}
	void methodDefault(){
		methodPrivate();
	}
	private void methodPrivate(){
		System.out.println("class TestX: methodProtected");
		System.out.println("value of private value a "+c);
		System.out.println("value of long "+b);
		System.out.println("value of protected value float "+f);
		System.out.println("value of char"+m);
	}
}
	