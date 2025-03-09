import java.util.Scanner;

public class Question3 {
    /*
    3. Reverse a String
Problem Statement:
Write a program to reverse a given string using StringBuilder.
Test Cases:
● Input: "hello" → Output: "olleh"
● Input: "Java" → Output: "avaJ"
● Input: "racecar" → Output: "racecar"
● Input: "abcde" → Output: "edcba"
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        System.out.println(reverseString(str));
    }
    static String reverseString(String str)
    {
        String revStr = "";
        for (int i = str.length()-1; i>=0; i--)
            revStr += str.charAt(i);
        return revStr;
    }
}
