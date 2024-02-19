package files_pac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class file_que {

	public void main2(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
	    int[] array = {1,2,3,4,5,5};
	    for (int i=0;i<array.length; i++)
	    	numbers.offer(array[i]);
	    Queue<Integer> numbers2 = new LinkedList<>();
	    int[] array2 = {1,5,3,4,5,2};
	    for (int i=0;i<array2.length; i++)
	    	numbers2.offer(array2[i]);
	    String filename="C:\\Users\\berge\\eclipse-workspace\\files\\src\\files_pac\\inp.txt";
		System.out.println(reverseHalf(numbers, filename));
		System.out.println(reverseHalf(numbers2, filename));

	}
	
public boolean reverseHalf(Queue<Integer> q, String filename) {
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
    String[] data=readFile(filename);
    for(int i=0;i<size;i++){
        Integer q_elem=q.remove();
        Integer s_data_elem=Integer.parseInt(data[i]);
        if (!q_elem.equals(s_data_elem)){ 
        	return false;  
        }
    }
    return true;
}
    public String[] readFile (String fileName){
//	try read from the file
	String[] data= {};
	try { 
		FileReader fr = new FileReader(fileName); 
		BufferedReader br = new BufferedReader(fr);
		int lines = 0;
        while (br.readLine() != null) lines++;
        fr = new FileReader(fileName); 
		br = new BufferedReader(fr);
		String str;
		str = br.readLine();
		data=new String[lines];
		data[0]=str;
		for(int i=1; i<lines; i=i+1) {
			str = br.readLine();
			data[i]=str;
			
		}
		br.close();  
	}
	
	catch(IOException ex) {  
		System.out.print("Error reading file\n" + ex);
	    	System.exit(2);
	}
	return data;
	}
}
