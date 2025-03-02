public class Question24 {
    /*
    24. Find the Subarray with Maximum Sum (Kadane’s Algorithm)
Problem Statement:
Find the maximum sum subarray from a given array.
Test Cases:
Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (Subarray: [4, -1, 2, 1])
Input: [1, 2, 3, -2, 5]
Output: 9 (Subarray: [1, 2, 3, -2, 5])
Input: [-1, -2, -3, -4]
Output: -1 (Subarray: [-1])
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr= array.createArray();
        System.out.println(findMaximumSum(arr));
    }
    //Kadanes Algorithm
    //Solution for Leetcode question 53
    static int findMaximumSum(int[] arr)
    {
        //[-2, 1, -3, 4, -1, 2, 1, -5, 4]
        int maxSum = 0, sum = 0,maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxElement) maxElement = arr[i];
            sum += arr[i];
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        if(maxSum == 0)
            return maxElement;
        return maxSum;
    }
    //if maxSum =0 the return the maximum element
}
