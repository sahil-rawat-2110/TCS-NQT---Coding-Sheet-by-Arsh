// 1. Two Sum
//
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//        Example 3:
//
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
//


import java.sql.Array;
import java.util.Scanner;

public class arr_1_twoSum {

    static int[] twoSumArr(int []arr, int target){
            int a[] =new int[2];
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        a[0]=i;
                        a[1]=j;
                        break;
                    }
                }
            }
            return a;
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
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int [] newArr = twoSumArr(arr, target);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] +" ");
        }
    }

}
