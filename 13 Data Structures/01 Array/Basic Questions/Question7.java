import java.util.Scanner;

public class Question7 {
    /*
    7. Copy Elements of One Array to Another
Problem Statement:
Copy all elements from one array into another.
Test Cases:
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
Input: [10, 20, 30]
Output: [10, 20, 30]
Input: [99, 75, 100, 120]
Output: [99, 75, 100, 120]
Explanation:
Create a new array and copy values.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        int[] arrCopy = arr;
        array.display(arr);
        System.out.println();
        array.display(arrCopy);
    }
}
