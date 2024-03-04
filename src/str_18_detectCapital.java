// 18 Detect Capital
//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//        All letters in this word are capitals, like "USA".
//        All letters in this word are not capitals, like "leetcode".
//        Only the first letter in this word is capital, like "Google".
//        Given a string word, return true if the usage of capitals in it is right.
//
//
//
//        Example 1:
//
//        Input: word = "USA"
//        Output: true
//        Example 2:
//
//        Input: word = "FlaG"
//        Output: false

import java.util.Scanner;

public class str_18_detectCapital {

        static boolean detectCapitalUse(String word) {
            if(word.length() <= 1) return true;
            char capA = 'A';
            char capZ = 'Z';
            boolean initialCap = word.charAt(0) >= capA && word.charAt(0) <= capZ;
            boolean isLeadingCharacterCap = word.charAt(1) >= capA && word.charAt(1) <= capZ;

            // case: aA
            if(!initialCap && isLeadingCharacterCap) return false;

            for(int i = 2; i < word.length(); i++) {
                char chr = word.charAt(i);
                if(chr >= capA && chr <= capZ) {
                    if(!isLeadingCharacterCap) return false;
                } else {
                    if(isLeadingCharacterCap) return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.next();
        System.out.println(detectCapitalUse(str));
    }

}
