import java.util.Scanner;

public class BinarySearch {
    /*
    Works only on sorted array
    if array is unsorted sort it first
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        ArrayImplementation arrays = new ArrayImplementation();
        int[] arr = arrays.createArray();
        System.out.println("Enter the key: ");
        int key = ip.nextInt();
        System.out.println(binarySearchRecursive(arr,0, arr.length-1, key));
    }
    public static int binarySearchIterative(int[] arr, int key)
    {
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == key)
                return mid;
            if(key < arr[mid])
                high = mid -1;
            else
                high = mid + 1;
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] arr,int low, int high, int key)
    {
        if(low <= high)
        {
            int mid = (low + high)/2;
            if(arr[mid] == key)
                return mid;
            if(key < arr[mid])
                return binarySearchRecursive(arr,0,mid-1,key);
            else
                return binarySearchRecursive(arr,mid+1,high,key);
        }
        return -1;
    }
}
