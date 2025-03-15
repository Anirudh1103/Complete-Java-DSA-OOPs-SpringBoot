import java.util.Scanner;

public class Question10 {
    /*
    10. Find the Index of an Element in an Array
Problem Statement:
Return the index of a given number in an array, or -1 if not found.
Test Cases
Input: [1, 2, 3, 4, 5], Target: 3
Output: 2
Input: [10, 20, 30, 40], Target: 50
Output: -1
Input: [99, 75, 100, 120], Target: 120
Output: 3
Explanation:
Loop through the array and return the index when found.
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayImplementation array = new ArrayImplementation();
        int[] arr1 = array.createArray();
        System.out.println("\nEnter the target element: ");
        int target = ip.nextInt();
        System.out.println(findIndex(arr1, target));
    }
    static int findIndex(int[] arr, int target)
    {
        for(int i=0;i< arr.length;i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
}
