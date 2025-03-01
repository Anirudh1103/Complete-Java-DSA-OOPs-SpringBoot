public class SortingAlgorithms {
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        selectionSort(arr);
        array.display(arr);

    }
    static void selectionSort(int[] arr)
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
