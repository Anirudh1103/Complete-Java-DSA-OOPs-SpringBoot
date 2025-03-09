import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Question26 {
    /*
    26. Rearrange Array in Alternating Positive and Negative
Order
Problem Statement:
Rearrange the array such that positive and negative numbers alternate.
Test Cases:
Input: [1, 2, -3, -4, 5, -6]
Output: [1, -3, 2, -4, 5, -6]
Input: [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
Output: [5, -5, 2, -2, 4, -8, 7, 1, 8, 0]
Input: [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
     */
    public static void rearrange(int[] arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        int posIndex = 0, negIndex = 0, i = 0;

        // Alternate positive and negative numbers
        while (posIndex < positives.size() && negIndex < negatives.size()) {
            arr[i++] = positives.get(posIndex++);
            arr[i++] = negatives.get(negIndex++);
        }

        // Append remaining elements
        while (posIndex < positives.size()) {
            arr[i++] = positives.get(posIndex++);
        }
        while (negIndex < negatives.size()) {
            arr[i++] = negatives.get(negIndex++);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // int[] arr = {1, 2, -3, -4, 5, -6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
