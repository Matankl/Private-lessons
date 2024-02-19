package tirgul_06;

public class ex4 {

	public static void printRuler(int n)
	{
		if (n == 0)
			return;
		
		// print sub ruler
		printRuler(n - 1);
		
		// print '-' in amount of n, read about "repeat"
		System.out.println("-".repeat(n));
		
		// print sub ruler
		printRuler(n - 1);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		printRuler(3);

	}

}
