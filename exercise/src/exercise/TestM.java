package exercise;

  class TestM {
	private int a=10;
	long l=2000;
	protected float r=23.45f;
	
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
		System.out.println("class TestM: methodProtected");
		System.out.println("value of private value a "+a);
		System.out.println("value of long "+l);
		System.out.println("value of protected value float "+r);
	}
	

	
}
