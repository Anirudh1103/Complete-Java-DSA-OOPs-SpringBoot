public class Question3 {
    /*
    3. Find the Minimum Element in an Array
Problem Statement:
Find the smallest number in a given array.
Test Cases:
Input: [10, 20, 30, 40, 50]
Output: 10
Input: [-5, -10, -1, -20]
Output: -20
Input: [99, 75, 100, 120, 110]
Output: 75
Explanation:
Iterate through the array and track the minimum value.

     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr)
    {
        int min = arr[0];
        for(int i: arr)
            if(i < min)
                min = i;
        return min;
    }
}
