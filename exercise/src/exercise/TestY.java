package exercise;
import exercise.TestN;
import exercise.TestM;

public class TestY extends TestN{
	void defaultmethod(){
		System.out.println("TestY class");
	}

	public static void main(String[] args) {
		TestY x=new TestY();
		x.defaultmethod();
		new TestY().methodPublic();
		new TestM().methodPublic();

	}

}
