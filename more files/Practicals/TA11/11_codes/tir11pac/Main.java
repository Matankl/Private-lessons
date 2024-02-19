package tir11pac;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que Q = new que();
		Queue<Integer> numbers = new LinkedList<>();
	    numbers.offer(1);
	    numbers.offer(2);
	    numbers.offer(3);
	    numbers.offer(4);
	    System.out.print(numbers);
		Q.reverseHalf(numbers);
		System.out.println(numbers);
		Queue<Integer> pali1 = new LinkedList<>();
	    pali1.offer(1);
	    pali1.offer(2);
	    pali1.offer(2);
	    pali1.offer(1);
	    System.out.println(Q.isPalindrome(numbers));
		System.out.println(Q.isPalindrome(pali1));
		PrintRightView.main2(null);
	}

}
