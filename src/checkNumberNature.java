//       4 Number is Positive, Negative, Odd, Even, Zero


import java.util.Scanner;

public class checkNumberNature {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Negative Number");
        } else if (number==0) {
            System.out.println("Number is zero");
        } else{
            System.out.println("Positive Number");
        }

        if (number%2==0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }

    }
}
