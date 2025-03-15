public class Question2 {
    /*
    2. Find the Maximum Element in an Array
Problem Statement:
Find the largest number in a given array.
Test Cases:
Input: [10, 20, 30, 40, 50]
Output: 50
Input: [-5, -10, -1, -20]
Output: -1
Input: [99, 75, 100, 120, 110]
Output: 120
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println(findMax(arr));
    }
    static int findMax(int[] arr)
    {
        int max = arr[0];
        for(int i: arr)
            if(i > max)
                max = i;
        return max;
    }
}
