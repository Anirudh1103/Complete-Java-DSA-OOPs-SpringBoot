public class Question12 {
    /*
    12. Find the Second Smallest Element in an Array
Problem Statement:
Find the second smallest number in an unsorted array of unique integers.
Test Cases:
Input: [10, 5, 8, 20]
Output: 8
Input: [1, 2, 3, 4, 5]
Output: 2
Input: [99, 75, 100, 120, 110]
Output: 99
Input: [3]
Output: "Not enough elements"
Input: [7, 7, 7, 7]
Output: "Not enough distinct elements"
Explanation:
1. Traverse the array while keeping track of the smallest and second smallest numbers.
2. If there is only one unique element, return an error messag
     */
    public static void main(String[] args) {
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr = arrays.createArray();
        if(arr.length == 1)
            System.out.println("Not enough elements");
        else
            System.out.println(getSecondMin(arr));
    }
    public static int getSecondMin(int[] arr)
    {
        sort(arr);
        return arr[1];
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
