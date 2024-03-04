//3 Remove character
//Input:
//string1 = “computer”
//string2 = “cat”
//Output: “ompuer”
//Explanation: After removing characters(c, a, t)
//from string1 we get “ompuer”.
//
//Input:
//string1 = “occurrence”
//string2 = “car”
//Output: “ouene”
//Explanation: After removing characters
//(c, a, r) from string1 we get “ouene”.


import java.util.*;

public class str_3_removeCharacter {

    public static String solve(String str1, String str2) {
        HashMap < Character, Integer > mp = new HashMap < > ();
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str2.length(); i++) {
            mp.put(str2.charAt(i), 1);
        }
        for (int i = 0; i < str1.length(); i++) {
            if (mp.get(str1.charAt(i)) == null)
                ans.append(str1.charAt(i));
        }
        return ans.toString();
    }

    public static String removeChars(String string1,String string2){
        // we extract every character of string string 2
        for (int index = 0; index < string2.length(); index++) {
            char i = string2.charAt(index);
            // we find char exit or not
            while (string1.contains(i + "")) {
                int itr = string1.indexOf(i);
                // if char exit we simply remove that char
                string1 = string1.replace((i + ""), "");
            }
        }
        return string1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1 : ");
        String str1 = sc.next();
        System.out.println("Enter a string 2 : ");
        String str2 = sc.next();
        System.out.println("Final string : ");
        System.out.println(solve(str1,str2));
//        System.out.println(removeChars(str1,str2));
        
    }
}
