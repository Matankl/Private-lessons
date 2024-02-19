package zoo;

public class NinjaTurtle extends Turtle {
	private int wepon;
	public NinjaTurtle(String name, int weight,int carapace_size, int wepon) {
		super(name,weight,carapace_size);
		this.wepon = wepon;
	}
	
	@Override
	public void roar() {
		System.out.println("kababanga");
	}

}
