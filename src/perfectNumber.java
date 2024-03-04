import java.util.Scanner;

////12 Perfect Number
//Input: n = 15
//        Output: false
//        Divisors of 15 are 1, 3 and 5. Sum of
//        divisors is 9 which is not equal to 15.
//
//        Input: n = 6
//        Output: true
//        Divisors of 6 are 1, 2 and 3. Sum of
//        divisors is 6.
public class perfectNumber {

    static boolean isPerfectNumber(int  num ){
        int divisor = 0;
        boolean result = true;
        for (int i = 1; i < num; i++){
            if(num % i == 0){
                divisor = divisor+i;
            }
        }
        if(divisor==num){
            result = true;
        }
        else{
            result= false;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isPerfectNumber(num));

    }
}
