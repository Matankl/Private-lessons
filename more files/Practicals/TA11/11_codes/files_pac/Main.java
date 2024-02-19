package files_pac;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		file_que F = new file_que();
		F.main2(null);
		file_transformer F2 = new file_transformer();
		String[] data=F2.readFile("files_pac\\inp.txt");
		F2.writeFile("files_pac\\out.txt",data);
		
	}

}
