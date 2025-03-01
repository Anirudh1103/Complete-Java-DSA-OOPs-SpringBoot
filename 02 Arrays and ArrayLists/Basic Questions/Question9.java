import java.util.ArrayList;
import java.util.Arrays;

public class Question9 {
    /*
    9. Merge Two Arrays
Problem Statement:
Merge two arrays into a single array.
Test Cases:
Input: [1, 2, 3], [4, 5, 6]
Output: [1, 2, 3, 4, 5, 6]
Input: [10, 20], [30, 40, 50]
Output: [10, 20, 30, 40, 50]
Input: [99], [75, 100, 120]
Output: [99, 75, 100, 120]
Explanation:
Create a new array and add elements from both.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr1 = array.createArray();
        int[] arr2 = array.createArray();
        Integer[] mergedArray = mergeTwoArray(arr1,arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
    static Integer[] mergeTwoArray(int[] arr1,int[] arr2)
    {
        Integer[] merged = new Integer[arr1.length + arr2.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr1)
            list.add(i);
        for(int i: arr2)
            list.add(i);
        return list.toArray(merged);
    }
}
