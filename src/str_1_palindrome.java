//1 Given String is Palindrome or not
//A string is said to be palindrome if the reverse of the string is the same as the string.
// For example, “abba” is a palindrome because the reverse of “abba” will be equal to “abba”
// so both of these strings are equal and are said to be a palindrome, but “abbc” is not a palindrome.

import java.util.Scanner;

public class str_1_palindrome {

    static void isPalindrome(String str){
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                System.out.println("It is not a palindrome");
                return;
            }
            s++;
            e--;
        }
        System.out.println("It is a palindrome");
        return;
    }


    //Using recursion

    public static boolean isPalindromeRecursion(int i, int j,String A){
        // comparing the two pointers
        if (i >= j) {
            return true;
        }
        // comparing the characters on those pointers
        if (A.charAt(i) != A.charAt(j)) {
            return false;
        }
        // checking everything again recursively
        return isPalindromeRecursion(i + 1, j - 1, A);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        isPalindrome(str);
//        System.out.println(isPalindromeRecursion(0, str.length()-1, str));
    }
}
