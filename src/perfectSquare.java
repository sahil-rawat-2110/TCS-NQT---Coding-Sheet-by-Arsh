//  7.   Valid Perfect Square
//

import java.security.KeyStore;
import java.util.Scanner;

public class perfectSquare {
    static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start = 1;
        int end = num;

        while(start<=end){
            long   mid = start + (end-start)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid<num/mid ){
                start  = (int)mid+1;
            }
            else{
                end = (int)mid-1;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :  ");
        int num = sc.nextInt();
        boolean result = isPerfectSquare(num);
        if(result == true){
            System.out.println("It is a perfect square");
        }
        else{
            System.out.println("It is not a perfect square");
        }

    }
}









    // class Solution {
    //    public boolean isPerfectSquare(int num) {
    //        boolean result = false;
    //        for(int i = 1; i*i<=num; i++){
    //            if(i*i == num){
    //                return true;
    //            }
    //        }
    //        return result;
    //    }
    //
    // }