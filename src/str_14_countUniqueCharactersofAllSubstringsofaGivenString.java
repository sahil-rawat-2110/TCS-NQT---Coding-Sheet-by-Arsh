
//14 Count Unique Characters of All Substrings of a Given String

//Let's define a function countUniqueChars(s) that returns the number of unique characters in s.
//
//        For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique
//        characters since they appear only once in s, therefore countUniqueChars(s) = 5.
//        Given a string s, return the sum of countUniqueChars(t) where t is a substring of s. The test cases are
//        generated such that the answer fits in a 32-bit integer.
//
//        Notice that some substrings can be repeated so in this case you have to count the repeated ones too.

//        Example 1:
//
//        Input: s = "ABC"
//        Output: 10
//        Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
//        Every substring is composed with only unique letters.
//        Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
//        Example 2:
//
//        Input: s = "ABA"
//        Output: 8
//        Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
//        Example 3:
//
//        Input: s = "LEETCODE"
//        Output: 92

import java.util.Arrays;
import java.util.Scanner;

public class str_14_countUniqueCharactersofAllSubstringsofaGivenString {
     static int uniqueLetterString(String s) {
        int total = 0;

        // Initialize our most-recent and second-most-recent arrays
        int[] l1 = new int[26];
        int[] l2 = new int[26];
        Arrays.fill(l1, -1);
        Arrays.fill(l2, -1);

        // Iterate through every position in String s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Update the arrays with the new char
            l2[c - 'A'] = l1[c - 'A'];
            l1[c - 'A'] = i;

            // Add the difference between the most-recent index and second-most-recent   index of every letter to the global total
            for (int j = 0; j < l1.length; j++) {
                total += (l1[j] - l2[j]);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        System.out.println(uniqueLetterString(s.toUpperCase()));
    }
}
