public class Question17 {
    /*
    17. Shift Array Elements to the Right by One Position
Problem Statement:
Shift the array elements to the right by one position.
Test Cases:
Input: [1, 2, 3, 4]
Output: [4, 1, 2, 3]
Input: [10, 20, 30]
Output: [30, 10, 20]
Input: [5]
Output: [5]
Clue:
1. Store the last element.
2. Move all elements one step right.
3. Place the last element at the beginning.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        if(arr.length!=1)
            shiftRight(arr);
        array.display(arr);
    }
    static void shiftRight(int[] arr)
    {
        int lastElement = arr[arr.length-1];
        //Shifting elements 1 pos to right
        int temp = arr[0];
        //We have to store next element in temp
        for(int i=0;i< arr.length-1;i++)
        {
            int nextEle = arr[i+1];
            arr[i+1] = temp;
            temp = nextEle;
        }
        arr[0] = lastElement;
    }
}
