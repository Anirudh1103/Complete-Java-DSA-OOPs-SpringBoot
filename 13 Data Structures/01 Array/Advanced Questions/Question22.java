import java.util.Scanner;
import java.util.Stack;

public class Question22 {
    /*
     Rotate an Array by K Positions (Left Rotation)
Problem Statement:
Rotate an array to the left by k positions.
Test Cases:
Input: [1, 2, 3, 4, 5], k = 2
Output: [3, 4, 5, 1, 2]
Input: [10, 20, 30, 40, 50], k = 3
Output: [40, 50, 10, 20, 30]
Input: [99, 75, 100, 120], k = 1
Output: [75, 100, 120, 99]
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println("Enter the value of K: ");
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        int[] result = roateLeft(arr,k);
        array.display(result);
    }
    static int[] roateLeft(int[] arr, int k)
    {
        int[] result = new int[arr.length];
        int counter = 0;
        for(int i=k;i< arr.length;i++)
            result[counter++] = arr[i];
        for(int i=0;i<k;i++)
            result[counter++] = arr[i];
        return result;
    }
}
