//str_11_convertharacters of a string to opposite case
//Input : geeksForgEeks
//Output : GEEKSfORGeEKS
//
//Input : hello every one
//Output : HELLO EVERY ONE


import java.util.Scanner;

public class str_11_convertCharactersOfastringtooppositecase {
    static void opposite(String str){
        String x = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                x += Character.toLowerCase(ch);
            else
                x += Character.toUpperCase(ch);
        }
        System.out.println(x);
    }


    static void oppositeUsingStringBuilder(String str){
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            } else {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        str = sb.toString();
        System.out.println(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string  : ");
        String str = sc.nextLine();
        opposite(str);
        oppositeUsingStringBuilder(str);
    }
}
