public class LeetCode152 {
    /*
152. Maximum Product Subarray
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
     */
    public static void main(String[] args) {
        ArrayImplementation arr = new ArrayImplementation();
        int[] nums = arr.createArray();
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        //[ 2,3,-2,4 ]
        int maxProduct = 0, product = nums[0], maxElement = nums[0],fullProduct = nums[0];
        if(nums.length == 1) return nums[0];
        for (int i = 1; i < nums.length; i++) {
            product *= nums[i];
            fullProduct *= nums[i];
            if(product > maxProduct) maxProduct = product;
            if(product <= 0) product = nums[i];
            if(nums[i] > maxElement) maxElement = nums[i];
        }
        if(fullProduct > maxProduct) return fullProduct;
        if(maxProduct <= 0) return maxElement;
        return maxProduct;
    }
}