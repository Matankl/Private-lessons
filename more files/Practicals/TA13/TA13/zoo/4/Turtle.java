package zoo;

public class Turtle extends Animal{
	private int carapace_size;
	public Turtle(String name, int weight,int carapace_size) {
		super(name, weight);
		this.carapace_size = carapace_size;
	}
	
	public void roar() {
		System.out.println("Squik");
	}
	 public Turtle child(Animal p) {
		 return new Turtle("son_of_" + this.name + "_and_" + p.name,3,this.carapace_size);
	 }
}
