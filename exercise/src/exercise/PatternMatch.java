package exercise;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("\\D*@gmail.com","firstname@gmail.com"));
		System.out.println(Pattern.matches("\\D*@gmail.com","virendra@gmail.com"));
		System.out.println(Pattern.matches("\\D*@gmail.com","test123prepare@co.edu.com"));
		System.out.println(Pattern.matches("91\\d{10}","918970339790"));
		System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z0-9]{6}","R1238jug0j"));



	}

}
