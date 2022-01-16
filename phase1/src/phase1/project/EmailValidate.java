package phase1.project;

import java.util.regex.Pattern;

public class EmailValidate {
		public static void main(String[] args) {
			String Email1="Prajna699@gmail.com";
			String Email2="pajju@gmail.com";
			String Email3="123445@gmail.com";
			String Email4="@gmail.com";
			String Email5="praju$fdrgmail.com";

			
			System.out.println("Email 1 Prajna699@gmail.com: " +validateEmail(Email1));
			System.out.println("Email 2 @pajjugmail.com: " +validateEmail(Email2));
			System.out.println("Email 3 123445@gmail.com: " +validateEmail(Email3));	
			System.out.println("Email 4 123445@gmail.com: " +validateEmail(Email4));	
			System.out.println("Email 5 123445@gmail.com: " +validateEmail(Email5));	

		}
		public static String validateEmail(String email) {
			if(email==null || email.isEmpty()) {
				return "valid";
			}
			Pattern pattern;
			String emailRegex="^(.+)@(.+)$";
					Pattern pattern1 =Pattern.compile(emailRegex);
			if(pattern1.matcher(email).matches()){
				return"valid";
			}else {
				return"Invalid";
			}
				
		}
	}

	


