public class Question8 {
    /*
    8. Find the Average of Array Elements
Problem Statement:
Compute the average (mean) of numbers in an array.
Test Cases:
Input: [1, 2, 3, 4, 5]
Output: 3.0
Input: [10, 20, 30]
Output: 20.0
Input: [99, 75, 100, 120]
Output: 98.5
Explanation:
Sum all elements and divide by the number of elements.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println(findAverage(arr));
    }
    static float findAverage(int[] arr)
    {
        int sum = 0;
        for(int i: arr)
            sum += i;
        return sum/arr.length;
    }
}
