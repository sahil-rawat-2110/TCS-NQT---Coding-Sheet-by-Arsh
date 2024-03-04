//2 Check if a given year is leap year

import java.util.Scanner;

public class leapYearORNot {

    static void leapOrNot(int year){
        if ((year % 400 == 0) ||  (year % 100 != 0) &&  (year % 4 == 0) ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not leap year ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :  ");
        int year = sc.nextInt();
        leapOrNot(year);

    }
}
