//  3.  Prime Numbers

import java.util.Scanner;

public class primeNumbers {

//    Write a program to print a number is prime or not
    static void primeChecker(int number){
        int count = 0;
        for(int i = 1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check prime or not : ");
        int number = sc.nextInt();
        primeChecker(number);
    }
}






//import java.util.Scanner;
//
//public class primeNumbers {
//
////    Write a program to print  number 1 to n
//    static boolean primeNumberPrinter(int number){
//        int count = 0;
//        for(int i = 1; i<=number; i++){
//            if(number%i==0){
//                count++;
//            }
//        }
//        if(count==2){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int number = sc.nextInt();
//        for(int i=1; i<=number; i++){
//            if(primeNumberPrinter(i)){
//                System.out.print(i + " ");
//            }
//        }
//
//    }
//}
