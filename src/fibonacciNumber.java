

// 9  Print first n Fibonacci numbers
//
//import java.util.Scanner;
//
//public class fibonacciNumber {
//    static void fibNum(int num){
//        if(num <= 0){
//            System.out.println("Enter a valid number");
//            return;
//        }
//        int a = -1;
//        int b = 1;
//        int c;
//        for(int i = 1; i<=num; i++){
//            c = a+b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//        fibNum(num);
//    }
//}
//





import java.util.Scanner;

public class fibonacciNumber {
    static int fibNum(int num){
       if(num == 1){
           return 0;
       } else if (num == 2) {
           return 1;
       }
       else{
           return fibNum(num-1) + fibNum(num - 2);
       }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            System.out.print(fibNum(i) + " ");
        }
    }
}






