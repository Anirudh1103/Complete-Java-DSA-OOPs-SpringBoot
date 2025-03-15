import java.util.Scanner;

public class Question6 {
    /*
    6. Count Occurrences of an Element in an Array
Problem Statement:
Count how many times a given number appears in an array.
Test Cases:
Input: [1, 2, 2, 3, 3, 3, 4], Target: 3
Output: 3
Input: [10, 10, 20, 30, 10], Target: 10
Output: 3
Input: [99, 75, 100, 120, 99], Target: 99
Output: 2
Explanation:
Use a loop and count occurrences.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        Scanner ip = new Scanner(System.in);
        int[] arr = array.createArray();
        System.out.println("Enter the target element: ");
        int target = ip.nextInt();
        System.out.println(countOccurences(arr, target));
    }
    static int countOccurences(int[] arr, int target)
    {
        int count = 0;
        for(int i: arr)
            if(i == target)
                count++;
        return count;
    }
}
