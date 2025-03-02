import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Question21 {
    /*
    21. Rotate an Array by K Positions (Right Rotation)
Problem Statement:
Rotate an array to the right by k positions.
Test Cases:
Input: [1, 2, 3, 4, 5], k = 2
Output: [4, 5, 1, 2, 3]
Input: [10, 20, 30, 40, 50], k = 3
Output: [30, 40, 50, 10, 20]
Input: [99, 75, 100, 120], k = 1
Output: [120, 99, 75, 100]
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println("Enter the value of K: ");
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        roateRight(arr,k);
        int[] result = roateRight(arr,k);
        array.display(result);
    }
    static int[] roateRight(int[] arr, int k)
    {
        int[] result = new int[arr.length];
        int counter = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            result[counter++] = arr[i];
        }
        for(int i=0;i< arr.length-k;i++)
            result[counter++] = arr[i];
        return result;
    }
}
