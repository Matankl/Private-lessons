

public class ExampleClass {
    //variables

    //constructor


    // Method 1: Calculate the factorial of a number
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method 2: Find the nth Fibonacci number
//    public int fibonacci(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative indices");
//        }
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        int a = 0, b = 1, result = 0;
//        for (int i = 2; i <= n; i++) {
//            result = a + b;
//            a = b;
//            b = result;
//        }
//        return result;
//    }

    /*
    n<0             // exeption
    n =0            // 0
    n > 0           // fib(n)
     */

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("cant find sub zero fibonacci");
        }
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    // Method 3: Reverse a string
        public String reverseString(String input) {

        }
















//    public String reverseString(String input) {
//        if (input == null) {
//            throw new IllegalArgumentException("Input string cannot be null");
//        }
//        StringBuilder reversed = new StringBuilder();
//        for (int i = input.length() - 1; i >= 0; i--) {
//            reversed.append(input.charAt(i));
//        }
//        return reversed.toString();
//    }

    // Method 4: Check if a string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // Method 5: Find the maximum element in an array
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


}
