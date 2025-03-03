public class Question29 {
    /*
    29. Find the First Missing Positive Integer
Problem Statement:
Find the smallest missing positive integer from an unsorted array.
Test Cases:
Input: [3, 4, -1, 1]
Output: 2
Input: [1, 2, 0]
Output: 3
Input: [7, 8, 9, 11, 12]
Output: 10
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        sort(arr);
        System.out.println("\n" + findMissingNumber(arr));
    }
    static int findMissingNumber(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int num = arr[i]+1;
            if(num != arr[i+1] && num!= 0)
                return num;
        }
        return (arr[arr.length-1] + 1);
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
