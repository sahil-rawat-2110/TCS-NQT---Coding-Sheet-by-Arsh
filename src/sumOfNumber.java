//15 Sum of first n natural numbers

import java.util.Scanner;

public class sumOfNumber {


    static  void sumOfFirstNNumber(int num){
        int sum = 0;
        for (int i = 1; i <= num ; i++) {
            sum = sum + i;
        }
        System.out.println("sum of first " + num + " number : " +sum);
    }

    static void usingFormula(int num){
        int sum = (num*(num+1))/2;
        System.out.println("sum of first " + num + " number using formula  : " +sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sumOfFirstNNumber(num);
        usingFormula(num);

    }
}
