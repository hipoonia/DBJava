import java.util.*;

public class JavaLesson6b {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("How old are you? ");
		
		int age = checkValidAge();
		
		if (age != 0) {
			System.out.println("you are "+ age+ " years old.");
		}

	}
	
	public static int checkValidAge() {
		
		try {
			return userInput.nextInt();
		}
		catch (InputMismatchException e) {
			
			userInput.next();
			System.out.println("That isnt a whole number!");
			return 0;
			
		}
		
	}

}
