public class PartionStringIntoSets {
    /*
    Problem: Partition Number String Into Valid Sets
Problem Statement
You are given a string s consisting of digits (0-9), representing a number. Your task is to partition this string into the minimum number of sets, where:

Each set consists of one or more contiguous digits from the string.
The integer value of each set must not be greater than a given integer k.
The sets must be formed in order (i.e., you cannot reorder digits).
Return the minimum number of sets required to partition s while satisfying the above conditions.

Example 1
Input:
plaintext
Copy
Edit
s = "1234"
k = 30
Output:
plaintext
Copy
Edit
3
Explanation:
The valid partition is:
{12}, {3}, {4}

12 is ≤ 30
3 is ≤ 30
4 is ≤ 30
If we tried {1}, {2}, {34}, 34 exceeds 30, so this is not allowed.
Example 2
Input:
plaintext
Copy
Edit
s = "100"
k = 10
Output:
plaintext
Copy
Edit
2
Explanation:
The valid partition is {10}, {0}

10 is ≤ 10
0 is ≤ 10
Example 3
Input:
plaintext
Copy
Edit
s = "54321"
k = 100
Output:
plaintext
Copy
Edit
3
Explanation:
The valid partition is {54}, {32}, {1}

54 is ≤ 100
32 is ≤ 100
1 is ≤ 100
     */
    public static void main(String[] args) {
        String s = "1234";
        int k = 30;
        System.out.println(partitionString(s,k));
    }
    static int partitionString(String s, int k)
    {
        int digit = 0, num = 0, count = 0;
        for(char c: s.toCharArray())
        {
            digit = c - '0';
            if(num * 10 + digit <=k)
                num = num * 10 + digit;
            else
            {
                count++;
                num = digit;
            }
        }
        return count+1;
    }
}
