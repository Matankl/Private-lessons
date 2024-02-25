package Lesson12;

import java.util.ArrayList;
import java.util.Collections;

public class Questions {

    public static boolean booleanMaze(Boolean[][] maze) {
        int len = maze.length;
        if (len == 0) {
            return false;
        } else if (!maze[0][0] || !maze[len - 1][len - 1]) {
            return false;
        }
        return booleanMazeRec(maze, 0, 0);
    }

    private static boolean booleanMazeRec(Boolean[][] maze, int i, int j) {
        int length = maze.length;
        if (i >= length || j >= length || !maze[i][j]) {
            return false;
        }
        if (i == length - 1 && j == length - 1) {
            return true;
        }
        return booleanMazeRec(maze, i + 1, j) || booleanMazeRec(maze, i, j + 1);
    }

    public static int gcd(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        if (numbers.length == 2) {
            return gcdEuclid(numbers[0], numbers[1]);
        }
        int output = gcdEuclid(numbers[0], numbers[1]);
        for (int i = 2; i < numbers.length; i++) {
            output = gcdEuclid(output, numbers[i]);
            if (output == 1) {
                return 1;
            }
        }
        return output;
    }

    private static int gcdEuclid(int a, int b) {
        if (a == 0)
            return b;
        return gcdEuclid(b % a, a);
    }

    public static boolean isSet(ListInterface l) {
        if (l.size() <= 1) {
            return true;
        }
        for (int i = 0; i < l.size() - 1; i++) {
            for (int j = i + 1; j < l.size(); j++) {
                int num1 = l.get(i);
                int num2 = l.get(j);
                if (num1 == num2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ListInterface toSet(ListInterface l) {
        if (Questions.isSet(l)) {
            return l;
        }
        LinkedList output = new LinkedList();
        int index = 0;
        for (int i = 0; i < l.size(); i++) {
            output.addAt(l.get(i), index);
            index++;
            if (!isSet(output)) {
                output.removeElementAt(index);
                index--;
            }
        }
        return output;
    }

    public static LinkedList intersection(ListInterface l1, ListInterface l2) {
        LinkedList output = new LinkedList();
        int index = 0;
        for (int i = 0; i < l1.size(); i++) {
            int num1 = l1.get(i);
            for (int j = 0; j < l2.size(); j++) {
                int num2 = l2.get(j);
                if (num1 == num2) {
                    output.addAt(num1, index);
                    index++;
                    break;
                }
            }
        }
        return (LinkedList) Questions.toSet(output);
    }

    /**
     * Easier solution, but longer.
     * The idea is to work with arraylist instead of linkedlist, and only create the output as a
     * linkedlist.
     *
     * @param l1 the input list
     * @param l2 the second list
     * @return "set" intersection list
     */

    public static LinkedList intersection2(ListInterface l1, ListInterface l2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        LinkedList output = new LinkedList();
        for (int i = 0; i < l1.size(); i++) {
            arr1.add(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            arr2.add(l2.get(i));
        }
        boolean added = false;
        int index = 0;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr2.contains(arr1.get(i))) {
                output.addAt(arr1.get(i), index);
                index++;
            }
        }
        return (LinkedList) Questions.toSet(output);
    }

    public static String sort(String str) {
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return "";//invalid input
            }
            if (c >= '1' && c <= '9') {//filter the 0's
                arr.add(c);
            }
        }
        Collections.sort(arr);
        String output = "";
        for (int i = 0; i < arr.size(); i++) {
            output += arr.get(i);
        }
        return output;
    }
}
