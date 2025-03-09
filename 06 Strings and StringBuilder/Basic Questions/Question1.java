import java.util.Scanner;

public class Question1 {
    /*
    1. Palindrome Check
Problem Statement:
Write a Java program to check if a given string is a palindrome. A palindrome is a word that
reads the same forward and backward.
Test Cases:
● Input: "madam" → Output: true
● Input: "hello" → Output: false
● Input: "racecar" → Output: true
● Input: "Noon" → Output: true (Ignore case)
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str)
    {
        String revStr = "";
        for(int i = str.length()-1; i>=0; i--)
            revStr += str.charAt(i);
        return str.equals(revStr);
    }

}
