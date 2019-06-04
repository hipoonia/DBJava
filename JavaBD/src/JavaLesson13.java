import java.util.Arrays;


public class JavaLesson13 {

	public static void main(String[] args) {
		

		String randomString = "I'm just a random string";
		
		String gotToQuote = "He said, \"I'm here\" "; 
		
		int num2 = 2;
		
		System.out.println(randomString+ " "+ gotToQuote + num2);
		
		int num = 123;
		
		String numS = Integer.toString(num);
		System.out.println(numS);
		num = Integer.parseInt(numS);
		System.out.println(num);
		
		String uppercase = "BIG";
		String lowercase = "big";
		
		if (uppercase.equals(lowercase))
		{
			System.out.println("They are equal");
		} else {
			System.out.println("not");
		}
		
		
		if (uppercase.equalsIgnoreCase(lowercase)) {
			System.out.println("NOW They are equal");
		}
		
		String letters = "abcdefa";
		String moreLetters = "ghijklmnop";
		
		System.out.println("2nd Char: " + letters.charAt(1));
		
		System.out.println(letters.compareTo(moreLetters));
		System.out.println(moreLetters.compareTo(letters));
		
		System.out.println(letters.contains("bcd"));
		System.out.println(letters.contains("bd"));
		
		System.out.println(letters.endsWith("ef"));
		
		System.out.println(letters.startsWith("a"));
		System.out.println(letters.startsWith("b"));
		
		
		System.out.println(letters.indexOf("cd"));
		System.out.println(letters.indexOf("cdf"));
		
		System.out.println(letters.indexOf("a"));
		System.out.println(letters.indexOf("a", 2));
		
		System.out.println(letters.lastIndexOf("a"));
		
		System.out.println("Length: "+ letters.length());
		
		System.out.println(letters.replace("abc", "xy"));
		System.out.println(letters);
		
		letters.replace("abc", "xyzasasa");
		System.out.println(letters);
		
		String str = "hi , we will remove , the , commas, using , splitter";
		System.out.println(str);
		
		String[] letterArray = str.split(",");
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(letters.substring(1,4));
		
		System.out.println(letters.toUpperCase());
		
		String randString = "         abcas ds    ";
		
		System.out.println(randString.trim());
		
		// STRINGS IN JAVA ARE IMMUTABLE
		
		StringBuilder randSB = new StringBuilder ("A random value");
		System.out.println(randSB.capacity());
		System.out.println(randSB.append(" again"));
		System.out.println(randSB);
		
		System.out.println(randSB.capacity());
		System.out.println(randSB.delete(15,21));
		System.out.println(randSB);
		
		System.out.println(randSB.capacity());
		
		randSB.ensureCapacity(61);
		System.out.println(randSB.capacity());
		
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.append(" asasa asas asasa asasas asas"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "a asasas asasas asasa asasa asasa asasa asasas asa"
				+ "sas asasa asasa asasa asasa "));
		
		System.out.println(randSB.capacity());
		
		randSB = new StringBuilder ("A  NEW random string");
		System.out.println(randSB.capacity());
		
		System.out.println(randSB.insert(1, "nother"));
		
		String oldStr = randSB.toString();
		System.out.println(oldStr);
		
		// charAt, indexOf, lastIndexOf, subString : StringBUilder have these also just like String

	}

}
