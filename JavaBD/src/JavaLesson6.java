//import java.lang.RunTimeException;


public class JavaLesson6 {
	
	public static void main (String[] args) {
		
		divideByZero(2);
		
	}
	
	public static void divideByZero(int a) {
		
		try 
		{
			System.out.println(a/0);
		}
		catch (ArithmeticException e) {
			
			System.out.println("You cant do that ");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			
			e.printStackTrace();
		}
		
	}

}
