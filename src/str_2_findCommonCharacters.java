//2 Find Common Characters
//Given a string array words, return an array of all characters that show up in all
// strings within the words (including duplicates). You may return the answer in any order.
//
//
//
//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]

import java.util.*;

import java.util.Scanner;

public class str_2_findCommonCharacters {
        public static List<String> commonChars(String[] A) {
            int[] last = count(A[0]);
            for (int i = 1; i < A.length; i++) {
                last = intersection(last, count(A[i]));
            }
            List<String> arr = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                if (last[i] != 0) {
                    char a = 'a';
                    a += i;
                    String s = String.valueOf(a);
                    while (last[i] > 0) {
                        arr.add(s);
                        last[i]--;
                    }
                }
            }
            return arr;
        }
        static int[] intersection(int[] a, int[] b) {
            int[] t = new int[26];
            for (int i = 0; i < 26; i++) {
                t[i] = Math.min(a[i], b[i]);
            }
            return t;
        }
        static int[] count(String str) {
            int[] t = new int[26];
            for (char c : str.toCharArray()) t[c - 'a']++;
            return t;
        }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length of array : ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter array of string : ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        List<String> result = commonChars(str);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}

