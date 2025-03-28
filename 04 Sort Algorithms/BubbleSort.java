import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,2,6,5,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
            for(int j=0;j< arr.length-i -1 ;j++)
                if(arr[j] > arr[j+1])
                    swap(arr,j,j+1);
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
