//import java.util.Scanner;
//Write an algorithm to determine if a number n is happy.
//
//        A happy number is a number defined by the following process:
//
//        Starting with any positive integer, replace the number by the sum of the squares of its digits.
//        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a
//        cycle which does not include 1.
//        Those numbers for which this process ends in 1 are happy.
//        Return true if n is a happy number, and false if not.
//
//        Example 1:
//
//        Input: n = 19
//        Output: true
//        Explanation:
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1
//        Example 2:
//
//        Input: n = 2
//        Output: false


//-------------------------leetcode-----------------


import java.util.*;

public class happyNumber {
        static boolean isHappy(int n) {
            Set<Integer> set = new HashSet();
            int sum;
            while(n != 1 && !set.contains(n)) {
                set.add(n);
                sum = 0;
                while(n != 0) {
                    sum += (n % 10) * (n % 10);
                    n /= 10;
                }
                n = sum;
            }
            return n == 1;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it is happpy number or not : ");
        int num = sc.nextInt();
        System.out.println(isHappy(num));
    }
}






//---------------google-----------------------
//
//public class HappyNumber
//{
//    //isHappyNumber() will determine whether a number is happy or not
//    public static int isHappyNumber(int num){
//        int rem = 0, sum = 0;
//
//        //Calculates the sum of squares of digits
//        while(num > 0){
//            rem = num%10;
//            sum = sum + (rem*rem);
//            num = num/10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int num = 82;
//        int result = num;
//
//        while(result != 1 && result != 4){
//            result = isHappyNumber(result);
//        }
//
//        //Happy number always ends with 1
//        if(result == 1)
//            System.out.println(num + " is a happy number");
//            //Unhappy number ends in a cycle of repeating numbers which contains 4
//        else if(result == 4)
//            System.out.println(num + " is not a happy number");
//    }
//}
//Output:
//
//        82 is a happy number
//        C#
//        using System;
//
//public class HappyNumber
//{
//    //isHappyNumber() will determine whether a number is happy or not
//    public static int isHappyNumber(int num){
//        int rem = 0, sum = 0;
//
//        //Calculates the sum of squares of digits
//        while(num > 0){
//            rem = num%10;
//            sum = sum + (rem*rem);
//            num = num/10;
//        }
//        return sum;
//    }
//
//    public static void Main()
//    {
//        int num = 82;
//        int result = num;
//
//        while(result != 1 && result != 4){
//            result = isHappyNumber(result);
//        }
//
//        //Happy number always ends with 1
//        if(result == 1)
//            Console.WriteLine(num + " is a happy number");
//            //Unhappy number ends in a cycle of repeating numbers which contains 4
//        else if(result == 4)
//            Console.WriteLine(num + " is not a happy number");
//    }
//}
//Output:
//
//        82 is a happy number