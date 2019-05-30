
public class JavaLessonThree {
	
	public static void main(String[] args) {
		
		double randomNumber = (Math.random()*50);
		System.out.println(randomNumber);
		
		randomNumber = (int) (Math.random()*50);
		System.out.println(randomNumber);
		
		if (randomNumber<25) {
			System.out.println("you lose");
		}
		else {
			System.out.println("you win");
		}
		
		if(!(false)) {
			System.out.println("negetive*negetive = positive");
		}
		
		if (true || false) {
			System.out.println("such a silly thing to do");
		}
		
		if (true ^ false) {
			System.out.println("mr ZOR");
		}
		
		if (false && false) {
			System.out.println("only first fase would be checked");
		}
		
		if (false & false) {
			System.out.println("here both false would be checked ");
		}
		
		int i=0;
		
		if (true | i++==0) {
			System.out.println(i);
			System.out.println("here also ,both the conditions would be checked");
		}
		
		int x = 1;
		int y=2;
		
		int z = (y>x) ? y : x;
		System.out.println(z);
		
		char grade = 'A';
		
		switch (grade) {
		
		case 'A':
			System.out.println("great job");
		    break;
		case 'B':
			System.out.println("good job");
			break;
		case 'F':
			System.out.println("fail sale");
			break;
		default:
			System.out.println("what!!");
			break;
		
		}
		
		switch (grade) {
		
		case 'A':
			System.out.println("great job");
		//	break;
		case 'B':
			System.out.println("good job");
		//	break;
		case 'F':
			System.out.println("fail sale");
			break;
		default:
			System.out.println("what!!");
			break;
		
		}
		
		
		
	}

}
