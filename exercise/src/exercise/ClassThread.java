package exercise;
public class ClassThread extends Thread{
	 public void run(){
		 
		 for(int i=1;i<3;i++){
			   
			   System.out.println("running thread name is:"+Thread.currentThread().getName());  
			   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  
			   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  
			   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
		}

		}

		public static void main(String[] args) {
		ClassThread m1=new ClassThread();
		ClassThread m2=new ClassThread();
		ClassThread m3=new ClassThread();

		m1.setName("IT");
		m2.setName("FINANCE");
		m3.setName("HR");

		m1.start();  
		m2.start();  
		m3.start();

		}

		}
