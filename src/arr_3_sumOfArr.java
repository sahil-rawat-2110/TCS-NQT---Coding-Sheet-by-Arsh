//3 Sum of elements in a given array

//Given an array of integers, find the sum of its elements.
//
//        Examples:
//
//        Input : arr[] = {1, 2, 3}
//        Output : 6
//        Explanation: 1 + 2 + 3 = 6
//
//        Input : arr[] = {15, 12, 13, 10}
//        Output : 50
//

import java.util.Scanner;

public class arr_3_sumOfArr {
    static int sumOfArray(int []arr){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans+=arr[i];
        }
        return ans;
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
        System.out.println(sumOfArray(arr));
    }
}

