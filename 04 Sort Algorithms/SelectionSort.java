import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        int index = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMin(arr, i);
            swap(arr, i,minIndex);
        }

    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int findMin(int[] arr, int n)
    {
        int min = arr[n],index = n;
        for (int i = n; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
