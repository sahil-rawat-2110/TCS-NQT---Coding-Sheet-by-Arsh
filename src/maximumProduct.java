import java.sql.Array;
import java.sql.Savepoint;

//19 Maximum Product of Three Numbers
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3]
//        Output: 6
//        Example 2:
//
//        Input: nums = [1,2,3,4]
//        Output: 24
//        Example 3:
//
//        Input: nums = [-1,-2,-3]
//        Output: -6

import java.util.Scanner;
import java.util.*;
public class maximumProduct {

    static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int case1 = nums[0]*nums[1]*nums[nums.length-1];    // if elements are negative
        int case2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];    // if elements are positive

        int maxProduct = Integer.max(case1, case2);
        return maxProduct;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        if(n<3){
            System.out.println("length of array should be greater than 3 ");
            return;
        }
        System.out.println("Enter a array : ");
        int [] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(nums));
    }
}
