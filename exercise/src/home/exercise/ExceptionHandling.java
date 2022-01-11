package home.exercise;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		try{
			int b[]=new int[10];
			b[10]=50;
		    int a=40/0;	
		} catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array outofbounds exception occurs");
		}
		catch(Exception e){
			System.out.println("parent exception occurs");
		}
		System.out.println("rest of the code...");

	}

}
