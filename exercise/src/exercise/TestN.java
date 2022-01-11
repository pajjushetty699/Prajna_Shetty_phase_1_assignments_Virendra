package exercise;

 class TestN {
	 protected long k=1233;
	 public int b=10;
	 double d=34235;
	 
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
			System.out.println("class TestN: methodProtected");
			System.out.println("value of protected value long "+k);
			System.out.println("value of b"+b);
			System.out.println("value of double "+d);
		}
		
 }