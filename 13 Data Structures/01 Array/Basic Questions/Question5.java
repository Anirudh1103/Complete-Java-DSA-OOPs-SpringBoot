import java.util.Scanner;

public class Question5 {
    /*
    5. Check if an Array Contains a Specific Element
Problem Statement:
Check if a target number exists in an array.
Test Cases:
Input: [1, 2, 3, 4, 5], Target: 3
Output: true
Input: [10, 20, 30, 40], Target: 50
Output: false
Input: [99, 75, 100, 120], Target: 120
Output: true
Explanation:
Loop through the array and check if the number exists.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        Scanner ip = new Scanner(System.in);
        int[] arr = array.createArray();
        System.out.println("Enter the key element: ");
        int key = ip.nextInt();
        System.out.println(findElement(arr, key));
    }
    static boolean findElement(int[] arr, int ele)
    {
        //Linear search
        for(int i: arr)
            if(i == ele)
                return true;
        return false;
    }
}
