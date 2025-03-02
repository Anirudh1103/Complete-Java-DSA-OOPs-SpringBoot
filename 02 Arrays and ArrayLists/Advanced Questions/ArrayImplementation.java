import java.util.Scanner;

public class ArrayImplementation {
    /*
    This program doesn't have any main function because an
    instance of this class will be created and used to create array without
    having to write basic functions of array again and again.
     */
    //For array creation
    public int[] createArray()
    {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = ip.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
            arr[i] = ip.nextInt();
        return arr;
    }
    //For displaying the array
    public void display(int[] arr)
    {
        for(int i:arr)
            System.out.print(i + " ");
    }
    //For swapping elements in array
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int getMaxIndex(int[] arr, int start, int end)
    {
        int maxIndex = 0,maxElement = arr[start];
        for(int i=start+1; i<=end; i++)
            if(arr[i] > maxElement)
            {
                maxElement = arr[i];
                maxIndex = i;
            }
        return maxIndex;
    }
    public int getMinIndex(int[] arr, int start, int end)
    {
        int minIndex = 0,minElement = arr[start];
        for(int i=start+1; i<=end; i++)
            if(arr[i] < minElement)
            {
                minElement = arr[i];
                minIndex = i;
            }
        return minIndex;
    }
}
