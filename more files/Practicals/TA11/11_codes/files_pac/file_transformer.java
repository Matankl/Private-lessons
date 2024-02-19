package files_pac;
import java.io.*;
public class file_transformer {
	
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
	public static void writeFile(String fileName, String[] data){
//	try write to the file
	   try { 
		FileWriter fw = new FileWriter(fileName);  
		PrintWriter outs = new PrintWriter(fw);
		for( int i = data.length-1; i >=0; i--)
		{
			outs.println(data[i]);
		}
		
		outs.close(); 
		fw.close();
	   }
	   catch(IOException ex) {  
		System.out.print("Error writing file\n" + ex);
	   }		
}

}
