
import java.util.Scanner;

public class JavaLessonTwo {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for (int j=0; j<100; j++) {
			
			int randomNumber = (int) (Math.random()*5+1);
			System.err.print(randomNumber+" ");
		}
		
		System.out.println(args);
		
		System.out.println("Your fav numner: ");
		
		if (userInput.hasNextInt()) {
			
			int numberEntered = userInput.nextInt();
			
			System.out.println("You entered " + numberEntered);
			
			int numEnteredTimes2 = numberEntered*2;
			
			System.out.println(numberEntered+ " + "+numberEntered+" = "+numEnteredTimes2);
			
		} else {
			
			System.out.println("Enter an integer next time");
			
		}
		
		System.out.println("Enter 2 integers");
		for (int i=0; i<2; i++) {
			//userInput = new Scanner(System.in);
			
			int x = userInput.nextInt();
			
			System.out.println("You entered: "+ x);
		}
		
		System.out.println(userInput);
		
		int i = (int)Math.ceil(5.32);
		System.out.println(i);
		
		i = (int)Math.floor(5.32);
		System.out.println(i);
		
		i = (int)Math.round(5.499);
		System.out.println(i);
		i = (int)Math.round(5.5001);
		System.out.println(i);
		
		
		
		
		
	}

}
