
public class JavaLesson15 {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Cars max speed: " + car.getSpeed());
		System.out.println("Num of Wheels: "+ car.getWheel());
		
		System.out.println("Num of Wheels: "+ car.numOfWheels);
		
		car.setCarStrength(10);
		
		System.out.println("Strength: " + car.getCarStrength());
		

	}

}
