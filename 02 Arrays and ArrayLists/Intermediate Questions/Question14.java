import java.util.Arrays;

public class Question14 {
    /*
    14. Sort an Array Without Using Built-in Methods
Problem Statement:
Sort an array without using Java’s built-in sorting functions (Arrays.sort()).
Test Cases:
Input: [4, 2, 9, 1, 5]
Output: [1, 2, 4, 5, 9]
Input: [99, 75, 100, 120, 110]
Output: [75, 99, 100, 110, 120]
Input: [3, 3, 3, 3]
Output: [3, 3, 3, 3]
Explanation:
Implement Bubble Sort, Selection Sort, or Insertion Sort to sort the array.
     */
    public static void main(String[] args) {
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr = arrays.createArray();
        selectionSort(arr);
        arrays.display(arr);
    }
    static void selectionSort(int[] arr)
    {
        ArrayImplementation array = new ArrayImplementation();
        for(int i=0;i< arr.length;i++)
        {
            int last = arr.length - 1 - i;
            int maxIndex = array.getMaxIndex(arr, 0, last);
            array.swap(arr,maxIndex,last);
        }
    }
}
