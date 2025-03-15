import java.util.Arrays;
import java.util.HashSet;

public class Question15 {
    /*
    15. Find the Common Elements Between Two Arrays
Problem Statement:
Return an array containing the common elements in two arrays.
Test Cases:
Input: [1, 2, 3, 4, 5], [3, 4, 5, 6, 7]
Output: [3, 4, 5]
Input: [10, 20, 30, 40], [50, 60, 70]
Output: []
Input: [99, 75, 100, 120], [75, 100, 130, 140]
Output: [75, 100]
     */
    public static void main(String[] args) {
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr1 = arrays.createArray();
        int[] arr2 = arrays.createArray();
        Integer[] commonElements = findCommonElements(arr1,arr2);
        System.out.println(Arrays.toString(commonElements));
    }
    static Integer[] findCommonElements(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++)
            for(int j=0;j< arr2.length;j++)
                if(arr1[i] == arr2[j])
                    set.add(arr1[i]);
        return set.toArray(new Integer[0]);
    }
}
