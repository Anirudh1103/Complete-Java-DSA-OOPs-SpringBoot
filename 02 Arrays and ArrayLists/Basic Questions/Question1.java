public class Question1 {
    /*
    1. Sum of Array Elements
Problem Statement:
Write a Java program that takes an array of integers and returns the sum of all elements.
Test Cases:
Input: [1, 2, 3, 4, 5]
Output: 15
Input: [10, 20, 30]
Output: 60
Input: [-5, 5, -10, 10]
Output: 0
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println(sumOfArray(arr));
    }
    public static int sumOfArray(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
            sum += i;
        return sum;
    }
}
