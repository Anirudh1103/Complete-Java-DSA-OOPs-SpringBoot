import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question18 {
    /*
    18. Find Pairs with a Given Sum in an Array
Problem Statement:
Find all pairs of numbers that add up to a target sum.
Test Cases:
Input: [1, 2, 3, 4, 5], Target: 5
Output: [(1, 4), (2, 3)]
Input: [10, 20, 30, 40, 50], Target: 60
Output: [(10, 50), (20, 40)]
Input: [5, 5, 5, 5], Target: 10
Output: [(5, 5), (5, 5)]
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        Scanner ip = new Scanner(System.in);
        int[] arr = array.createArray();
        int target = ip.nextInt();
        int[][] result = findPairs(arr,target);
        //Arrays.deepToString() is used to print 2D array in single line.
        System.out.println(Arrays.deepToString(result));
    }
    static int[][] findPairs(int[] arr, int target)
    {
        int count = 0;
        ArrayList<Integer> values = new ArrayList<>();
        for(int i=0;i< arr.length;i++)
            for(int j=i+1;j< arr.length;j++)
                if(arr[i] !=0 && arr[j]!= 0)
                    if((arr[i] + arr[j]) == target) {
                        values.add(arr[i]);
                        values.add(arr[j]);
                        arr[i] = 0;
                        arr[j] = 0;
                    count++;
                    }
        int i=0;
        int[][] result = new int[count][2];
        for (int j = 0; j < values.size(); j++) {
            result[i][0] = values.get(j++);
            result[i++][1] = values.get(j);
        }
    return result;
    }
}