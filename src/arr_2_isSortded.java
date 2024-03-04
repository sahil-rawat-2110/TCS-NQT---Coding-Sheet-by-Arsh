//2.  Program to check if an array is sorted or not
//Given an array of size n, write a program to check if it is sorted in ascending order or not.
//Equal values are allowed in an array and two consecutive equal values are considered sorted.
//
//        Examples:
//
//        Input : 20 21 45 89 89 90
//        Output : Yes
//
//        Input : 20 20 45 89 89 90
//        Output : Yes
//
//        Input : 20 20 78 98 99 97
//        Output : No
//

import java.util.Scanner;

public class arr_2_isSortded {

    static void isSorted(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter element of array : ");
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        isSorted(arr);
    }
}
