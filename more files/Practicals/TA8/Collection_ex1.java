package tirgul_8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Collection_ex1 {

	public static void main(String[] args) {
		Collection<molecule> hydro = new LinkedList<molecule>();
		for (int i=0;i<5;i++) hydro.add(new hydrogen());
		
		Collection<molecule> heli = new LinkedList<molecule>();
		for (int i=0;i<5;i++) heli.add(new helium());
		
		Collection<molecule> all = new Stack<molecule>();
		all.addAll(hydro);
		all.addAll(heli);
		
		Iterator<molecule> iter = all.iterator();
		while(iter.hasNext()) {
			molecule m = iter.next(); 
			System.out.println("name: " + m.getNAme() + " weight: " + m.weight());
		}

	}

}
