import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLesson11 {

	public static void main(String[] args) {
		
		ArrayList al1;
		
		al1 = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("sanju p");
		names.add("Reena");
		names.add("mummy");
		names.add("S Chander");
		
		names.add(2, "sandeep");
		
		for (int i=0; i<names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		System.out.println();
		
		names.set(0, "sanju");
		
		for (int i=0; i<names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		System.out.println();

		names.remove(0);
		
		for (int i=0; i<names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		
//		names.removeRange(0,1);
		
		System.out.println(names);
		
		for (String i : names) {
			System.out.println(i);
		}
		
		Iterator indivItems = names.iterator();
		
		System.out.println(indivItems);
		
		while(indivItems.hasNext()) {
			System.out.println(indivItems.next());
			System.out.println(indivItems);
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		nameCopy.addAll(names);
		
		System.out.println(nameCopy);
		
		String asd = "deep p";
		
		names.add(asd);
		
		System.out.println(names);
		
		if (names.contains(asd)) {
			System.out.println("deep p is in the list");
		}
		
		if (names.containsAll(nameCopy)) {
			System.out.println("nameCopy is subset of names");
		}
		
		nameCopy.add("new add");
		
		if (names.containsAll(nameCopy)) {
			System.out.println("nameCopy is subset of names");
		} else {
			System.out.println("not now");
		}
		
		names.clear();
		
		System.out.println(names);
		
		if (names.isEmpty()) {
			System.out.println("names list is empty");
		}
		
		Object[] moreNames = new Object[4];
		
	//	Object[] moreNames; // this also works
		
		moreNames = nameCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
		int[] checking = new int[4];
		
//		checking = nameCopy.toArray(); // Cant convert onject[] to int[]
		
		names.add("asfsafsaf");
		moreNames = names.toArray();
		
		
		System.out.println(Arrays.toString(moreNames));
		
		
				
		

	}

}
