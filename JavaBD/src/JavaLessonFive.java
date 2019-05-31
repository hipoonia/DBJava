import java.util.Scanner;

public class JavaLessonFive {
	
	static double myPI = 3.14159;  //Class Varaible 
	static int randomNum;
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 
		 
		 System.out.println(addThem(1,2));
		
		System.out.println("Global " + myPI);
		
		int d = 13;
		tryToChange(d);
		System.out.println(d);
		
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1) {
			System.out.println("Guess a number between 0 and 50 ");
			
			randomGuess = userInput.nextInt();
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the random number is " + randomNum);
	}
	
	public static int addThem (int a, int b) {
		
		double smallPI = 3.140; // local Variable
		
		System.out.println("Global " + myPI);
		
		double myPI = 3.0;
		System.out.println("Local " + myPI);
		System.out.println("GLOBAL " + JavaLessonFive.myPI);
		
		myPI += 2;
		
		System.out.println("Local " + myPI);
		System.out.println("GLOBAL " + JavaLessonFive.myPI);
		
		
		
		return a+b;
		
	}
	
	public static void tryToChange(int d) { //pass by value
		d = 10;
		return;
	}
	
	public static int getRandomNum() {
		
		 randomNum = (int)(Math.random()*51); //already been declared
		return randomNum;
	}
	
	public static int checkGuess(int guess) {
		
		if (guess==randomNum) {
			return -1;
		}
		else {
			return guess;
		}
		
	}

}
