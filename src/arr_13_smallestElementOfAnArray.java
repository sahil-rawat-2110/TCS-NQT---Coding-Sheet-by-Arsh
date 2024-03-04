//13 Smallest and second smallest elements in an array
//Input:  arr[] = {12, 13, 1, 10, 34, 1}
//        Output: The smallest element is 1 and
//        second Smallest element is 10


import java.util.Scanner;

public class arr_13_smallestElementOfAnArray {

    static void smallestElement(int[]arr){
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is: " + smallest);
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < second_smallest && arr[i] > smallest) {
                second_smallest = arr[i];
            }
        }
        System.out.println("second smallest element is: " + second_smallest);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter element of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        smallestElement(arr);

    }
}










//        import java.io.*;
//        import java.util.*;
//
//class GFG {
//    public static void main(String args[])
//    {
//        int arr[] = { 111, 13, 25, 9, 34, 1 };
//        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println("smallest element is " + arr[0]);
//        System.out.println("second smallest element is " + arr[1]);
//    }
//}
