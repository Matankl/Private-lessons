import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleClassTest {


    /*
        * Test List
        * n = 0             // ans = 1
        * n < 0             // ans = IllegalArgumentException
        * n > 0             // ans = n!
     */

    @Test
    public void testFactorial() {
        ExampleClass example = new ExampleClass();

        // Test factorial of a positive number
        assertEquals(120, example.factorial(5));
        // Test factorial of 0 (edge case)
        assertEquals(1, example.factorial(0));
        // Test handling of negative input
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-1));
    }


        /*
    n<0             // exeption
    n =0            // 0
    n > 0           // fib(n)
     */


    @Test
    public void testFibonacci() {
        ExampleClass example = new ExampleClass();
        //n<0
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> example.factorial(-30));

        // n=0
        assertEquals(0,example.fibonacci(0));
        //n>0
        assertEquals(832040, example.fibonacci(30));
        assertEquals(3, example.fibonacci(4));

////////////////////////////////////////////////////////////////////////////

        // Test Fibonacci for a positive index
        assertEquals(8, example.fibonacci(6));
        // Test Fibonacci for index 0 (edge case)
        assertEquals(0, example.fibonacci(0));
        // Test handling of negative index
        assertThrows(IllegalArgumentException.class, () -> example.fibonacci(-1));
    }

    @Test
    public void testReverseString() {
        ExampleClass example = new ExampleClass();

        // Test reversing a non-empty string
        assertEquals("cba", example.reverseString("abc"));
        // Test reversing an empty string (edge case)
        assertEquals("", example.reverseString(""));
        // Test handling of null input
        assertThrows(IllegalArgumentException.class, () -> example.reverseString(null));
    }

    @Test
    public void testIsPalindrome() {
        ExampleClass example = new ExampleClass();

        // Test a palindrome string
        assertTrue(example.isPalindrome("radar"));
        // Test a non-palindrome string
        assertFalse(example.isPalindrome("hello"));
        // Test handling of null input
        assertThrows(IllegalArgumentException.class, () -> example.isPalindrome(null));
    }

    @Test
    public void testFindMax() {
        ExampleClass example = new ExampleClass();

        // Test finding the maximum element in an array
        assertEquals(10, example.findMax(new int[]{5, 8, 10, 4, 3}));
        // Test finding the maximum element in an array with a single element (edge case)
        assertEquals(5, example.findMax(new int[]{5}));
        // Test handling of null input array
        assertThrows(IllegalArgumentException.class, () -> example.findMax(null));
        // Test handling of empty input array
        assertThrows(IllegalArgumentException.class, () -> example.findMax(new int[]{}));
    }
}
