package Upload;

public class Animal {

	private static int animalCounter = 0;
	protected String name;
	protected int age;
	
	public Animal() {
		this.setName("Rexy");
		this.setAge(3);
		Animal.animalCounter++;
	}
	
	public Animal(String name, int age) {
		this.setName(name);
		this.setAge(age);
		Animal.animalCounter++;
	}
	
	public void sleep() {
		System.out.println("Animal sleep");
	}
	
	public void makeSound() {
		System.out.println("Animal makeSound");
	}

	public int getAge() {
		return age;
	}

	protected void setAge(int age) {
		if(age>0) {
			this.age = age;
		}
		else {
			this.age = 3;
		}
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	public static int getAnimalCounter() {
		return animalCounter;
	}
	
	
	
}
