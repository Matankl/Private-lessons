import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        // Example 1: Handling ArithmeticException
        try {
            int result = divide(10, 0); // This will throw an ArithmeticException
            System.out.println("Result: " + result); // This line won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            System.err.println("Error in Example 1: " + e.getMessage());
        }

        // Example 2: Handling ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Attempting to access an element beyond the array size
            int value = numbers[10];
            System.out.println("Value: " + value); // This line won't be executed if an exception occurs
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error in Example 2: " + e.getMessage());
        }

        // Example 3: Handling FileNotFoundException
        try {
            // Attempting to read from a non-existent file
            readFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Error in Example 3: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        // Process the file content
    }
}
