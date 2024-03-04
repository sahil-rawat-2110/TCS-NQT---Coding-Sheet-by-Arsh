//   10.   Add Digits
//
//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
//        Example 1:
//        Input: num = 38
//        Output: 2
//        Explanation: The process is
//        38 --> 3 + 8 --> 11
//        11 --> 1 + 1 --> 2
//        Since 2 has only one digit, return it.
//        Example 2:
//
//        Input: num = 0
//        Output: 0
//
//        Constraints:
//
//        0 <= num <= 231 - 1

import java.util.Scanner;
public class addDigits {
    static int addDigits(int num){
        while(num > 9){
            num = check(num);
        }
        return num;
    }

    static int check(int num) {
        int add = 0;
        int rem;
        while(num > 0){
            rem = num % 10;
            add = add+rem;
            num = num/10;
        }
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }
}


