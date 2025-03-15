import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question20 {
    /*
    20. Find the Intersection of Two Arrays
Problem Statement:
Find the common elements between two arrays, maintaining unique values.
Test Cases:
Input: [1, 2, 3, 4, 5], [3, 4, 5, 6, 7]
Output: [3, 4, 5]
Input: [10, 20, 30, 40], [50, 60, 70]
Output: []
Input: [99, 75, 100, 120], [75, 100, 130, 140]
Output: [75, 100]
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr1 = array.createArray();
        int[] arr2 = array.createArray();
        System.out.println(Arrays.toString(findIntersection(arr1,arr2)));
    }
    static Integer[] findIntersection(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i< arr1.length;i++)
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j])
                    set.add(arr2[j]);
            }
        return set.toArray(new Integer[0]);
    }
}
