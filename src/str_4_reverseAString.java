//4 Reverse a string
//


import java.util.*;

public class str_4_reverseAString {

    static void reverseString(String str){
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ans = ch + ans;
        }
        System.out.println(ans);
    }

    static void reverseStringUsingStringBuilder(String str){
        StringBuilder ans = new StringBuilder();
        ans.append(str);
        ans.reverse();
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.next();
        reverseString(str);
        reverseStringUsingStringBuilder(str);
    }
}
