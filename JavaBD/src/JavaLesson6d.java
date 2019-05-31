import java.io.FileInputStream;
import java.io.*;


public class JavaLesson6d {
	
	public static void main (String[] args) {
		try {
		getAFile("./somestuff.txt");
		}
		
		catch (IOException e) {
			
			System.out.println("An IO error occured! ");
			
		}
	}
	
	public static void getAFile (String fileName) 
			throws IOException, FileNotFoundException
	{
		
		FileInputStream file = new FileInputStream(fileName);
	}
	
}