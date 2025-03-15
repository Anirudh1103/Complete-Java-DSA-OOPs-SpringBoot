import java.util.Arrays;
import java.util.HashSet;
public class Question13 {
    /*
    Problem Statement:
Given an ArrayList<Integer>, remove all duplicate elements and return a list of unique
elements.
Test Cases:
Input: [1, 2, 2, 3, 4, 4, 5]
Output: [1, 2, 3, 4, 5]
Input: [10, 20, 10, 30, 40, 30]
Output: [10, 20, 30, 40]
Input: [5, 5, 5, 5, 5]
Output: [5]
Input: []
Output: []
Clue:
Use a HashSet to filter out duplicates.
     */
    public static void main(String[] args) {
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr = arrays.createArray();
        Integer[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
    //We are using HashSet because it won't allow duplicate element insertion
    public static Integer[] removeDuplicates(int[] arr)
    {
        HashSet<Integer> set  = new HashSet<>();
        for(int i: arr)
            set.add(i);
        return set.toArray(new Integer[0]);
    }
}
