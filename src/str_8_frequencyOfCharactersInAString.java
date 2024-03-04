//8 Frequency of characters in a string
//Input : str = "geeksforgeeks"
//Output : g2 e4 k2 s2 f1 o1 r1
//
//Input : str = "elephant"
//Output : e2 l1 p1 h1 a1 n1 t1


import java.util.*;

public class str_8_frequencyOfCharactersInAString {

    public static void prCharWithFreq(String s){
        Map<Character, Integer> d = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (d.containsKey(s.charAt(i))) {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            }
            else {
                d.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (d.get(s.charAt(i)) != 0) {
                System.out.print(s.charAt(i));
                System.out.print(d.get(s.charAt(i)) + " ");
                d.put(s.charAt(i), 0);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.next();
        prCharWithFreq(str);
    }
}
