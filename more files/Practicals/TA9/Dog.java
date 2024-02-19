package Upload;

public class Dog extends Animal{
	private String species;
	public Dog() {
		super();
		this.setSpecies("Pug");
	}
	
	public Dog(String name, int age, String type) {
		super(name, age);
		this.setSpecies(type);
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog makeSound");
	}
	
	public static Dog getDog() {
		return new Dog("Lucky", 5, "German Shepherd");
	}
	
}
