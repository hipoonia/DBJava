import java.io.*;


public class JavaLesson6c {
	
	public static void main (String[] args) {
		
		getAFile("./somestuff.txt");
		
	}
	
	public static void getAFile (String fileName) {
		
		try {
		FileInputStream file = new FileInputStream(fileName);
		}
		
		catch (FileNotFoundException e) {
			System.out.println("Sorry, cant find that file.");
		}
		
		catch (IOException e) {
			
			System.out.println("Unknown IO error");
			
		}
		
//		catch (ClassNotFoundException e) {
//			// this is how you ignore en exception
//		}
		
		catch (Exception e) {
			
			System.out.println("Some error occured.");
			
		}
		
		finally {
			
			System.out.println("this is used for clean up duty. to close connections etc");
			
		}
		
	}

}
