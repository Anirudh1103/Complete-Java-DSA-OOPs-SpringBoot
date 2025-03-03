public class Question27 {
    /*
    27. Find the Majority Element (Element Occurring More
Than N/2 Times)
Problem Statement:
Find the element that appears more than N/2 times in an array.
Test Cases:
Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
Output: 4
Input: [1, 2, 3, 3, 3, 3, 3]
Output: 3
Input: [1, 1, 2, 2, 3, 3]
Output: "No Majority Element"
Explanation:
Use Boyer-Moore Voting Algorithm to find the majority element in O(N) time.
     */
    public static void main(String[] args) {
        ArrayImplementation array = new ArrayImplementation();
        int[] arr = array.createArray();
        System.out.println(boyerMooreAlgorithm(arr));
    }
    static int boyerMooreAlgorithm(int[] arr)
    {
        int me = arr[0],count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(me == arr[i])
                count++;
            if(me != arr[i])
            {
                count = 1;
                me = arr[i];
            }
        }
        int countMe = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == me)
                countMe++;
        }
        if(countMe > (arr.length/2))
            return me;
        return -1;
    }
}
