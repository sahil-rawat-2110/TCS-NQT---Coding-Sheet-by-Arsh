//19 Find Peak Element
//A peak element is an element that is strictly greater than its neighbors.
//
//Given a 0-indexed integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.
//
//You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered
// to be strictly greater than a neighbor that is outside the array.
//
//You must write an algorithm that runs in O(log n) time.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: 2
//Explanation: 3 is a peak element and your function should return the index number 2.
//Example 2:
//
//Input: nums = [1,2,1,3,5,6,4]
//Output: 5
//Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5
// where the peak element is 6.

import java.util.Scanner;

public class arr_19_findPeakElement {
        public static int findPeakElement(int[] nums) {
            int result =0;
            int n = nums.length;
            if(n == 1 || nums[0] > nums[1])
                return 0;

            if(nums[n - 1] > nums[n - 2])
                return n - 1;

            for(int i = 1; i<nums.length; i++){
                if(nums[i-1]< nums[i] && nums [i] > nums[i+1]){
                    result = i;
                }
            }
            return result;
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
        System.out.println(findPeakElement(arr));
    }
}
