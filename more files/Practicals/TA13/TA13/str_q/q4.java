package str_q;

public class q4 {
	public static int NUM_LETTERS = 'z'-'a'+1;
	public static int max_increase_substr_from_start(String str) {
		boolean[] used = new boolean[NUM_LETTERS];
		char max_letter = str.charAt(0);
		used[max_letter-'a'] = true;
		int max_letter_num = 0;
		for (int i = 0;i<str.length();i++) {
			if (str.charAt(i) >max_letter ) {
				max_letter = str.charAt(i);
				used[str.charAt(i)-'a'] = true;
				max_letter_num++;
			}
			else if (used[str.charAt(i)-'a']) {
				max_letter_num++;
			}
			else {
				return max_letter_num;
			}
		}
		return max_letter_num;
	}
	
	public static int max_new_increase_substring(String str) {
		int max_letter_num = 0;
		for (int i=0;i<str.length();i++) {
			int letter_num = max_increase_substr_from_start(str.substring(i, str.length()));
			if(letter_num > max_letter_num) max_letter_num = letter_num;
		}
		return max_letter_num;
	}
	
	public static void main(String[] args) {
		System.out.println(max_new_increase_substring("abfaaczcak"));
}
}
