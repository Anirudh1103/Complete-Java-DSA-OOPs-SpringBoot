import java.util.Arrays;

public class Question28 {
    /*
    28. Find the Longest Consecutive Sequence in an Array
Problem Statement:
Find the length of the longest consecutive sequence in an unsorted array.
Test Cases:
Input: [100, 4, 200, 1, 3, 2]
Output: 4 (Sequence: [1, 2, 3, 4])
Input: [0, 3, 7, 2, 5, 8, 4, 6, 1, 9]
Output: 10 (Sequence: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
Input: [1, 9, 3, 10, 4, 20, 2]
Output: 4 (Sequence: [1, 2, 3, 4])
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        sort(arr);
        array.display(arr);
        System.out.println("\n" + findLongestConsecutive(arr));
    }
    static int findLongestConsecutive(int[] arr)
    {
        int count = 0,maxCount = 0;
        for(int i=0;i< arr.length-1;i++)
        {
            int compValue = arr[i]+1;
            if(compValue == arr[i+1]) {
                count++;
            }
            else
                count = 0;
            if(maxCount < count)
                maxCount = count;
        }
        return maxCount+1;
    }
    static void sort(int[] arr)
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
