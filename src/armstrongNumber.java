//   13.  Armstrong Numbers
//        Input:153
//        Output: Yes
//        153 is an Armstrong number.
//        1*1*1 + 5*5*5 + 3*3*3 = 153


import java.util.*;

public class armstrongNumber {

    static void isArmstrongNumber(int num){
        int rem, sum = 0;
        int x = num;
        while (num>0){
            rem = num%10;
            sum = sum + (int)Math.pow(rem, 3);
            num = num/10;
        }
        if (sum == x){
            System.out.println("This is armstrong number : "+ x);
        }
        else {
            System.out.println("This is not a armstrong number : ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        isArmstrongNumber(num);
    }
}
