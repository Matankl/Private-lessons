package tir11pac;

import java.util.Queue;
import java.util.Stack;

public class que {
	
	public Queue<Integer> reverseHalf(Queue<Integer> q) {
	    Stack<Integer> s = new Stack<Integer>();
	    int size = q.size();
	            
	    for(int i = 0; i < size; i++) {
	        if(i % 2 == 1)
	            s.push(q.remove());
	        else
	            q.add(q.remove());
	    }
	                                                                
	    while(!s.isEmpty()) {
	        q.add(q.remove());
	        q.add(s.pop());
	    }
	    
	    if(size % 2 == 1)
	        q.add(q.remove());
	    return q;
	}
	public boolean isPalindrome(Queue<Integer> q) {
	    Stack<Integer> s = new Stack<Integer>();
	    int size = q.size();
	    boolean palindrome = true;
	                
	    for(int i = 0; i < size; i++) {
	        int n = q.remove();
	        q.add(n);
	        s.push(n);
	    }
	                                                    
	    for(int i = 0; i < size; i++) {
	        int n1 = q.remove();
	        int n2 = s.pop();
	        
	        if(n1 != n2)
	            palindrome = false;
	            
	        q.add(n1);
	    }
	    
	    return palindrome;
	}
}
