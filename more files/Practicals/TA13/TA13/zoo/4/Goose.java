package zoo;

public class Goose extends Animal {
	private String org;
	public Goose(String name, int weight,String org) {
		super(name, weight);
		this.org = org;
	}
	
	public void roar() {
		System.out.println("Quaq");
	}
}
