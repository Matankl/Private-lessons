public class recurtion_q_to_test {

    public class RecursionExamples {

        // Question 1: Write a recursive Java function to calculate the factorial of a given non-negative integer.
        public static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }

        // Question 2: Implement a recursive Java function to find the nth Fibonacci number.
        public static int findNthFibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
            }
        }

        /*
        n<0           // sum nth
        n>0           // sum nth
        |n|=1
        n not int //throw exception
         */



        // Question 3: Write a recursive Java function to calculate the sum of digits in a given positive integer.
        public static int calculateSumOfDigits(int n) {
            if (n == 0) {
                return 0;
            } else {
                return n % 10 + calculateSumOfDigits(n / 10);
            }
        }

        // Question 4: Implement a recursive Java function to perform exponentiation, raising a given base to a non-negative power.
        public static int power(int base, int exponent) {
            if (exponent == 0) {
                return 1;
            } else {
                return base * power(base, exponent - 1);
            }
        }

        // Question 5: Write a recursive Java function to generate all possible combinations of a given string.
        public static void generateCombinations(String input, String current, int index) {
            if (index == input.length()) {
                System.out.println(current);
                return;
            }

            generateCombinations(input, current, index + 1);
            generateCombinations(input, current + input.charAt(index), index + 1);
        }

        public static void main(String[] args) {
            // Example usage
            int n = 5;
            System.out.println("Factorial of " + n + ": " + calculateFactorial(n));

            n = 6;
            System.out.println("Fibonacci at position " + n + ": " + findNthFibonacci(n));

            int num = 12345;
            System.out.println("Sum of digits in " + num + ": " + calculateSumOfDigits(num));

            int base = 2;
            int exponent = 3;
            System.out.println(base + " raised to the power of " + exponent + ": " + power(base, exponent));

            String strInput = "abc";
            System.out.println("All combinations of " + strInput + ":");
            generateCombinations(strInput, "", 0);
        }
    }

}
