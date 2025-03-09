public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,78,89};
        System.out.println(binarySearch(arr,11,0,arr.length-1));
    }
    static int binarySearch(int[] arr, int key, int s, int e)
    {
        if(s > e)
            return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] == key)
            return mid;
        if(key > arr[mid])
            return binarySearch(arr,key,mid+1,e);
        return binarySearch(arr,key,s,mid-1);
    }
}
