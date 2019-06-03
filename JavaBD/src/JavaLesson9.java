import java.util.Arrays;

public class JavaLesson9 {
	
	public static void main (String[] args) {
		
		int[] randomArray;
		
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		for (int i=0; i<numberArray.length; i++) {
			numberArray[i] = i;
		}
		
		int k = 1;
		while (k<=41) {System.out.print('-'); k++;}
		System.out.println();
		
		for (int j=0; j<numberArray.length; j++) {
			System.out.print(" | "+j);
		}
		System.out.println(" |");
		
		String[][] multiArray = new String[10][10];
		
		for (int i=0; i<multiArray.length; i++) {
			for (int j=0; j<multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}
		
		k = 1;
		while (k<=61) {System.out.print('-'); k++;}
		System.out.println();
		
		for (int i=0; i<multiArray.length; i++) {
			for (int j=0; j<multiArray[i].length; j++) {
				System.out.print(" | " + multiArray[i][j] + " | ");
			}
			System.out.println();
		}
		
		for (int row : numberArray) {
			System.out.print(row);
		}
		System.out.println("\n");
		
		for (String[] rows : multiArray) {
			for (String column : rows) {
				System.out.print(" | " + column + " | ");
			}
			System.out.println();
		}
		
		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		System.out.println(numberCopy.length);
		System.out.println();
		
		for (int i: numberCopy) {
			System.out.print(i);
		}
		System.out.println();
		
		
		int[] range = Arrays.copyOfRange(numberArray, 3, 6);
		System.out.println(range.length);
		
		System.out.println(Arrays.toString(numberCopy));
		System.out.println(Arrays.toString(range));
		
		int[] moreNumbers = new int[35];
		Arrays.fill(moreNumbers, 2);
		System.out.println(Arrays.toString(moreNumbers));
		
		char[][] boardGame = new char[10][10];
		
		for (char[] row : boardGame) {
			Arrays.fill(row,'*');
		}
		
		int[] numToSort = new int[10];
		
		for (int i=0; i<10; i++) {
			numToSort[i] = (int)(Math.random()*100);
			System.out.print(numToSort[i]+ " ");
		}
		System.out.println();
		int wIs50 = Arrays.binarySearch(numToSort, 50);
		System.out.println(wIs50);
		
		Arrays.sort(numToSort);
		System.out.println();
		
		System.out.println(Arrays.toString(numToSort));
		
		int whereIs50 = Arrays.binarySearch(numToSort, 50);
		System.out.println(whereIs50);
		
	}

}










