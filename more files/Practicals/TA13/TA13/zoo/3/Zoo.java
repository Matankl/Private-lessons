package zoo;


public class Zoo {
	public static void main(String[] args) {
		// day 1
		Animal[] animals = new Animal[7];
		animals[0] = new Lion("Simba" ,3,14);
		animals[1] = new Goose("Uza" ,4,"Egypt");
		
		//day 2
		
		for(int i=0;i<Animal.num_of_animals; i++) {
			animals[i].roar();
		}
		Turtle batz = new Turtle("Batz",2,12);
		batz.roar();
		//Day 3
		animals[2] = new NinjaTurtle("rafael", 6, 5, 4);
		animals[2].roar();
		
		
	}
}
