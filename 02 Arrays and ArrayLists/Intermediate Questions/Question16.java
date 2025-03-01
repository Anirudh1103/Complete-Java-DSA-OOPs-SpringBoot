public class Question16 {
    /*
    16. Shift Array Elements to the Left by One Position
Problem Statement:
Shift the array elements to the left by one position.
Test Cases:
Input: [1, 2, 3, 4]
Output: [2, 3, 4, 1]
Input: [10, 20, 30]
Output: [20, 30, 10]
Input: [5]
Output: [5]
Clue:
1. Store the first element.
2. Move all elements one step left.
3. Place the first element at the end.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        if(arr.length!=1)
            shiftLeft(arr);
        array.display(arr);
    }
    static void shiftLeft(int[] arr)
    {
        int firstElement = arr[0];
        //Shifting elements 1 pos to left
        for(int i=1;i< arr.length;i++)
            arr[i-1] = arr[i];
        arr[arr.length-1] = firstElement;
    }

}
