import java.util.Scanner;

public class Question2 {
    /*
    2. Count Vowels & Consonants
Problem Statement:
Write a program to count the number of vowels and consonants in a given string.
Test Cases:
● Input: "hello" → Output: Vowels: 2, Consonants: 3
● Input: "Java" → Output: Vowels: 2, Consonants: 2
● Input: "aeiou" → Output: Vowels: 5, Consonants: 0
● Input: "BCDF" → Output: Vowels: 0, Consonants: 4
     */
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        int vowels = countVowels(str);
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+ (str.length() - vowels));
    }
    static int countVowels(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
            str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
            str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
            str.charAt(i) == 'I'|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
                count++;
        return count;
    }
}
