package exercise;
import exercise.TestX;

public class TestZ extends TestM{

	public static void main(String[] args) {
		new TestM().methodProtected();
		new TestN().methodDefault();
		new TestX().methodPublic();

	}

}
