package exercise;

public class TestP {
	public static void main(String args[]){
		new TestM().methodPublic();
		new  TestM().methodProtected();
		new TestM().methodDefault();
		System.out.println("value of protected value float "+new TestM().r);
	}
	public void methodPublic(){
		System.out.println("class TestP: methodPublic");
	}
	
	protected void methodProtected(){
		System.out.println("class TestP: methodProtected");
	}
	void methodDefault(){
		System.out.println("class TestP: methodDefault");
	}
	private void methodPrivate(){
		System.out.println("class TestP: methodPrivate");
	}

}
