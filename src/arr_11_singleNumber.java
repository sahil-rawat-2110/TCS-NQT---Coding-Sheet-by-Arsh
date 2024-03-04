//11 Single Number


import java.util.Scanner;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//        You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [2,2,1]
//        Output: 1
//        Example 2:
//
//        Input: nums = [4,1,2,1,2]
//        Output: 4
//        Example 3:
//
//        Input: nums = [1]
//        Output: 1
public class arr_11_singleNumber {
    static int singleNumber(int[] nums) {
        int ans=0;                              //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];                    // ans = (ans) XOR (array element at i)
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
        System.out.println(singleNumber(arr));
    }
}
