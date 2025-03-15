import java.util.Arrays;

public class Question11 {
    /*
    11. Find the Second Largest Element in an Array
Problem Statement:
Find the second largest number in an unsorted array of unique integers.
Input: [10, 5, 8, 20]
Output: 10
Input: [1, 2, 3, 4, 5]
Output: 4
Input: [99, 75, 100, 120, 110]
Output: 110
Input: [5]
Output: "Not enough elements"
     */
    public static void main(String[] args) {
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr = arrays.createArray();
        if(arr.length == 1)
            System.out.println("Not enough elements");
        else
            System.out.println(getSecondMax(arr));
    }
    public static int getSecondMax(int[] arr)
    {
        sort(arr);
        return arr[arr.length-2];
    }
    public static void sort(int[] arr)
    {
        ArrayImplementation array = new ArrayImplementation();
        for(int i=0;i< arr.length;i++)
        {
            int last = arr.length - 1 -i;
            int maxIndex = array.getMaxIndex(arr,0,last);
            array.swap(arr,maxIndex,last);
        }
    }

}
