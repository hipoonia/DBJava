
public class HelloWorld {
	
	static String randomString = "static string declared outside main";
	
	static int staticint = 100;
	
	static final double PINUM = 3.141529;

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(randomString);
		System.out.println(PINUM);
		
		randomString += " added this part";
		
		System.out.println(randomString);
		
	//	PINUM = 1.1; // cant change FINAL 
		
		int integerOne = 22;
		
		int integerTwo 
		= integerOne++; // still works.
		
		System.out.println(integerOne);
		System.out.println(integerTwo);
		
		integerTwo = ++integerOne;
		
		System.out.println(integerOne);
		System.out.println(integerTwo);
		
		integerOne = integerOne++;
		
		System.out.println(integerOne);
		
		integerOne = integerOne; // no effect
		
		byte bigByte = 127;
		short bigShort = 32767;
		
		System.out.println(bigByte);
		System.out.println(bigShort);
		
		bigByte++;
		System.out.println(bigByte);
		
		bigShort++;
		System.out.println(bigShort);
		
		long bigLong = 9220000000000000000L; //922 and 16 zeros AND L is compulsory
		
		System.out.println(bigLong);
		
		double bigDouble = 3.1423423423423423432432D; //D is optional || precise upto ~15 decimal places
		// float is precise upto ~ 6 decimal places
		
		System.out.println(bigDouble); // some digits gets truncated
		
		double a = 0.04;
		double b = 0.03;
		System.out.println(a-b); // not 100% accurate
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		float f = 3.123456789F; // F is compulsory
		System.out.println(f);
		
		boolean trueOrFalse = true;
		System.out.println(!trueOrFalse);
		
		char randomChar = 65;
		System.out.println(randomChar);
		
		char anotherChar = 'A';
		System.out.println((int)anotherChar);
		
		char c = 200;
		System.out.println(c);
		int j = 0;
		for (int i=-10; i<=34463; i++) {
			j++;
			if (j==20) {
				j=0;
				System.out.println();
			}
			char d = (char)i;
			System.out.print(d+" ");
		}
		
		char p = 'प';
		System.out.println((int)p);
		
		char last = '蚟';
		System.out.println((int)last); // 34463 ::TOTAL number of ASCII characters till now. may2019
		
		char escapedChars = '\r';
		System.out.println(escapedChars);
		System.out.println("-");
		
		System.out.println(randomString);
		String randomString = "the same random string declared again in main!!!";
		System.out.println(randomString);
		
		String x = "test";
		x += x;
		System.out.println(x);
		
		String byteString = Byte.toString(bigByte);
		System.out.println(byteString);
		byteString += x;
		
		System.out.println(byteString);
		
		System.out.println(integerOne);
		String intString = Integer.toString(integerOne);
		System.out.println(intString);
		
		System.out.println(staticint);
		int staticint = 0;
		System.out.println(staticint); // static variables can be re declared inside the main

		double aDouble = 3.14;
		int doubleToInt = (int)aDouble;
		System.out.println(aDouble);
		System.out.println(doubleToInt);
		
		double dd = 30000000000000000000.123;
		int ii = (int)dd;
		System.out.println(dd);
		System.out.println(ii);
		
		int stringtoInt = Integer.parseInt(intString);
		System.out.println(stringtoInt);
		
		
	}

}
