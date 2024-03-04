//6 Uncommon Words from Two Sentences
//Example 1:
//
//Input: s1 = "this apple is sweet", s2 = "this apple is sour"
//Output: ["sweet","sour"]
//Example 2:
//
//Input: s1 = "apple apple", s2 = "banana"
//Output: ["banana"]


import java.util.*;

public class str_6_uncommonWordsFromTwoSentences {

    static String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<String>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        for (String s: arr1) {
            if (map.containsKey(s)) {
                map.remove(s);
            }
            else if (!map2.containsKey(s) ){
                map.put(s, 0);
                map2.put(s, 0);
            }
        }
        for (String s: arr2) {
            if (map.containsKey(s)) {
                map.remove(s);
            }
            else if (!map2.containsKey(s) ){
                map.put(s, 0);
                map2.put(s, 0);
            }
        }
        String[] re = new String[map.size()];
        int i = 0;
        for (String s: map.keySet()) {
            re[i++] = s;
        }
        return re;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter a string 2 : ");
        String str2 = sc.nextLine();
        String[] ans = uncommonFromSentences(str1, str2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}
