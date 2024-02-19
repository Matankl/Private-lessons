package zoo;

public class Lion extends Animal{
	private int hair_vol;
	public Lion(String name, int weight,int hair_vol) {
		super(name, weight);
		this.hair_vol = hair_vol;
	}
	public void roar() {
		System.out.println("tttt");
	}
}
