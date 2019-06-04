import java.util.Arrays;
import java.util.LinkedList;


public class JavaLesson12 {

	public static void main(String[] args) {
		
		 LinkedList list1 = new LinkedList(); //not restricted
		 
		 LinkedList<String> names = new LinkedList<String>(); // restricted
		 
		 names.add("sanju");
		 names.add("Reena");
		 
		 
		 
		 names.addLast("mummy");
		 
		 names.addFirst("papa");
		 
		 names.add(0,"s chander");
		 
		 names.add(3, "deep");
		 
		 names.set(3, "pra");
		 
		 names.remove(3);
		 names.remove("sanju");
		 names.remove("not in the list");
		 
		 System.out.println("\n First Index: " + names.get(0) );
		 
	//	 System.out.println("\n First Index: " + names.get(10) ); //error
		 
		 System.out.println("\n Last Index: " + names.getLast() );
		 
		 for (String name : names) {
			 System.out.println(name);
		 }
		 
		 LinkedList<String> nameCopy = new LinkedList<String>(names);
		 
		 System.out.println("\nnameCopy: " + nameCopy);
		 
		 if (names.contains("papa")) {
			 System.out.println("papa is here");
		 }
		 
		 if (names.containsAll(nameCopy)) {
			 System.out.println("\n Collections the same");
		 }
		 
		 System.out.println("\n index of Reena: "+ names.indexOf("Reena"));
		 
		 System.out.println("\nList Empty: "+ names.isEmpty());
		 
		 System.out.println("\n size of names list: "+ names.size());
		 
		 System.out.println("\n Look without error: "+ names.peek());
		 
		 System.out.println("\n remove first element: "+ nameCopy.poll());
		 
		 System.out.println("\n Look without error: "+ nameCopy.peek());
		 
		 System.out.println("\n Look without error: "+ nameCopy.peekLast());
		 
		 System.out.println(nameCopy);
		 
		 System.out.println("\n Look without error: "+ nameCopy.pollLast());
		 
		 System.out.println(nameCopy);
		 
		 nameCopy.push("deep");
		 
		 System.out.println(nameCopy);
		 
		 nameCopy.pop();
		 
		 System.out.println(nameCopy);
		 
		 Object[] nameArray = new Object[4];
		 
		 nameArray = names.toArray();
		 
		 System.out.println(nameArray);
		 System.err.println(Arrays.toString(nameArray));
		 
		 names.clear();
		 
		 System.out.println(names);

	}

}
