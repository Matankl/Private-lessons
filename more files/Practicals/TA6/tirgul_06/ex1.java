package tirgul_06;

public class ex1 {
	
	public static int mulRec(int a, int b)
	{
		if (a == 0)
			return 0;
		
		return (b + mulRec(a - 1, b));
	}
	
	public static int mulIt(int a, int b)
	{
		int retMul = 0;
		
		for (int i = 0; i < a; i++)
		{
			retMul += b;
		}
		
		return retMul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
