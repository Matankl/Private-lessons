package zoo;

public class Animal {
	protected String name;
	protected int weight;
	public static int num_of_animals=0;
	Animal(String name, int weight){
		this.name = name;
		this.weight = weight;
		num_of_animals++;
	}
	
	public void roar(){
	System.out.println("ooo");
}
}
