package tirgul_8;

public class hydrogen implements molecule {
	public hydrogen(){
		name = "hydrogen";
		number =1;
		weight = 1.0080;
	}
	private String name;
	private int number;
	private double weight;
	public String getName() {return this.name;}
	public int moleculeNumber() {return this.number;}
	public double weight() {return this.weight;}
}
