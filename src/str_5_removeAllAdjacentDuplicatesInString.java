//5 Remove All Adjacent Duplicates In String
//Example 1:
//
//Input: s = "abbaca"
//Output: "ca"
//Explanation:
//For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
// and this is the only possible move.  The result of this move is that the string is "aaca",
// of which only "aa" is possible, so the final string is "ca".
//Example 2:
//
//Input: s = "azxxzy"
//Output: "ay"


import java.util.*;

public class str_5_removeAllAdjacentDuplicatesInString {

    static String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()>0&&st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
//        System.out.println(st);
        for(char ch: st){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.next();
        System.out.println(removeDuplicates(str));
    }
}
