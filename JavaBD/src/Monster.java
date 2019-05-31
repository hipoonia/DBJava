// A class can not have two public classes. 

public class Monster {
	
	public final String TOMEBSTONE = "Here lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;	
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack() { //getters
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		
		health = health - decreaseHealth;
		
		if (health<0) {
			alive = false;
		}
		
	}
	
	public void setHealth (double decrease) { // overloading. signature must be different
		
		health = health - (int)decrease;
		if (health<0) {
			alive = false;
		}
		
	}
	
	public Monster(int health, int newAttack, int newMovement) { //constructer
		
		this.health = health;
		attack = newAttack;
		movement = newMovement;
		
	}
	
	
	
	public Monster() { //default constructor
		
	}
	
	public Monster (int newHealth) {
		health = newHealth;		
	}
	
	public Monster (int newHealth, int newAttack) {
		this(newHealth);
		attack = newAttack;
	}
//	
//	public static void main(String[] args) {
//		
//		Monster Frank = new Monster();
//		System.out.println(Frank.attack);
//		
//	}
//	
	
	 
}