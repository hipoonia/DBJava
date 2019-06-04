
public class JavaLesson14 {

	public static void main(String[] args) {
		
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		Cats mandu = new Cats("mandu", "Tuna", "Rubber Mouse");
		
		System.out.println(mandu.getName());
		System.out.println(mandu.favFood);
		System.out.println(mandu.favToy);
		
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		//Every Cat is an animal. Because every method and field in animals is in the class cats
		
		acceptAnimal(tabby);
		

	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);

		System.out.println();
		
		randAnimal.walkAround();  // calls the cat walkaround method, not the animal's one
		
//		System.out.println(randAnimal.favToy); // favToy does not exist in animals.Hence error
		
		Cats tempCat = (Cats) randAnimal;
		System.out.println(tempCat.favToy); 
		
		System.out.println(((Cats)randAnimal).favToy); 
		
		if (randAnimal instanceof Animals) {
			System.out.println(randAnimal.getName() + " is a cat");
		}
		
		if (randAnimal instanceof Cats) {
			System.out.println(randAnimal.getName() + " is a cat");
		}
		
	}

}
