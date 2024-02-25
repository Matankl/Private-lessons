import java.util.Scanner;

// scan 23 string
// write a method to check if a string is valid
// for every string check if valid, if valid add 1 to counter
// at the end print the number of valid strings
public class Main {
    public static void main(String[] args) {
        String GG = "ASAFDFFDGAA";
        System.out.println(isValid(GG));

        Scanner scan = new Scanner(System.in);
        int couter = 0;
        int index = 0;
        int[] arr = new int[23];

        do {
            String curr = scan.nextLine();
            if (isValid(curr)) couter++;

            index++;
        } while (index<23);
        System.out.println(couter);
    }


    // contains at least 2 "A"
    // DOSE NOT CONTAINS "AA"
    public static boolean isValid(String str){
        int counter = 0;
        for(int i =0; i< str.length();i++){
            if (str.charAt(i) == 'A'){
                counter++;
                if (i < str.length()-1 && str.charAt(i + 1) == 'A')
                    return false;
            }
        }
        if (counter >= 2)
            return true;
        return false;
    }

}
// "ASAFDFFDGAA"
// Size = 12