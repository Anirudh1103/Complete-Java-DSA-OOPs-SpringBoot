import java.util.Scanner;

public class LinearSearch {
    /*
        In linear search we basically check every index of array if that is equal
        to the key element that we are searching for

        Note: linear search is not an efficient searching algorithm as it searches in every
        single index it becomes inefficient.
        - Linear search is better  to use on small arrays.

        Advantage:
        - It works on unsorted array as well
        Disadvantage:
        - Searches on every index
         */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        Scanner ip = new Scanner(System.in);
        int[] arr = array.createArray();
        System.out.println("Enter the key to be searched: ");
        int key = ip.nextInt();
        System.out.println(linearSearch(arr,key));
    }
    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
            if(arr[i] == key)
                return i;
        return -1;
    }
}
