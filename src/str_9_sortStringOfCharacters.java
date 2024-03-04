//9 Sort string of characters
//Given a string of lowercase characters from ‘a’ – ‘z’. We need to write a program to print
// the characters of this string in sorted order.
//
//Examples:
//
//Input : bbccdefbbaa
//Output : aabbbbccdef
//
//Input : geeksforgeeks
//Output : eeeefggkkorss

import java.util.*;

public class str_9_sortStringOfCharacters {
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.next();
        sortString(str);

    }
}
