import java.util.Scanner;

public class Question23 {
    /*
    23. Find Missing Number in a Consecutive Series
Problem Statement:
Find the missing number from a given range [1, N].
Test Cases:
makefile
CopyEdit
Input: [1, 2, 4, 5], N = 5
Output: 3
Input: [3, 7, 1, 2, 8, 4, 5], N = 8
Output: 6
Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14], N = 14
Output: 13
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = ip.nextInt();
        System.out.println(findMissingElement(arr,n));
    }
    static int findMissingElement(int[] arr,int n)
    {
        int expectedSum = n * (n + 1)/2, actualSum = 0;
        for(int i: arr)
            actualSum += i;
        return expectedSum - actualSum;
    }
}
