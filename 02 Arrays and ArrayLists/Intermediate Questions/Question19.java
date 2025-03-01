import java.util.Arrays;

public class Question19 {
    /*
    19. Check if Two Arrays are Equal
Problem Statement:
Return true if both arrays have the same elements in the same order.
Test Cases:
Input: [1, 2, 3], [1, 2, 3]
Output: true
Input: [1, 2, 3], [3, 2, 1]
Output: false
Input: [5, 5, 5], [5, 5, 5]
Output: true
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr1 = array.createArray();
        int[] arr2 = array.createArray();
        System.out.println(isArrayEqual(arr1,arr2));
    }
    static boolean isArrayEqual(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length)
            return false;
        for(int i=0; i< arr2.length;i++)
            if(arr1[i]  != arr2[i])
                return false;
        return true;
    }
}
