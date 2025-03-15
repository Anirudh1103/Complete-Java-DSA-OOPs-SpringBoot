public class Question4 {
    /*
    4. Reverse an Array
Problem Statement:
Reverse the order of elements in an array.
Test Cases:
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
Input: [10, 20, 30, 40]
Output: [40, 30, 20, 10]
Input: [99]
Output: [99]
Explanation:
Swap elements from start to end.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println("Array: ");
        array.display(arr);
        //Logic for reversing array
        int i=0, j = arr.length-1;
        while(i < j)
            array.swap(arr,i++,j--);
        System.out.println("\nReversed array: ");
        array.display(arr);
    }
}