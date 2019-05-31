import java.util.Scanner;


public class JavaLessonFour {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		int i=-0;
//		
//		while (i<=20) {
//			
//			if (i==3) {
//				i+=2;
//			//	continue;
//			}
//			
//			System.out.println(i);
//			i++;
//			
//			if (i%2==0) {
//				i++;
//			}
//			if (i>10) break;
//		}
		
		
		// 4 - 4/3 + 4/5 ...
		double myPi = 4.0;
		double j = 3.0;
		
//		while (j<8000000) {
		while (j<80) {
			
			myPi = myPi - (4/j) + 4/(j+2) ;
			j += 4;
			System.out.println(myPi);
		}
		
		String contYorN = "Y";
		
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y")) {
			
			System.out.println(h);
			System.out.println("Continue y or n? ");
			contYorN = userInput.nextLine();
			h++;
		}
		
		int k = 1;
		
		do {
			System.out.println(k);
			k++;
		} while (k<10);
		
		
		
	}

}
