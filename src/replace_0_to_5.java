//11 Replace all ‘0’ with ‘5’ in an input Integer
//Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
//
//        Examples:
//
//        Input: 102
//        Output: 152
//        Explanation: All the digits which are '0' is replaced by '5'
//
//        Input: 1020
//        Output: 1525
//        Explanation: All the digits which are '0' is replaced by '5'

import java.util.Scanner;

public class replace_0_to_5 {


    static int replace_0s_to_5s(int num){
        int newnum = 0;
        if(num == 0){
            newnum = 5;
        }

        while (num > 0){
            int rem = num%10;
            if(rem==0){
                rem = 5;
            }
            num = num/10;
            newnum = newnum*10+rem;
        }
        num = 0 ;
        while(newnum>0)
        {
            int rem = newnum%10;
            num= num*10 + rem;
            newnum =newnum / 10;
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(replace_0s_to_5s(num));
    }
}
