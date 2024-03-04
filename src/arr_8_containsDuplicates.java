//8 Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
//


import java.util.*;

public class arr_8_containsDuplicates {

//    Time Complexity : O(n^2) Space Complexity: O(1)
    static boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }


    // Using Sorting   Time Complexity : O(nlogn) Space Complexity: O(n) by using merge sort.
    static boolean usingSortingContainsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }


    // using Hash map        Time Complexity : O(n) and Space Complexity: O(n)
        static boolean usingHashMapContainsDuplicate(int[] nums) {
            HashMap<Integer, Integer> seen = new HashMap<>();
            for (int num : nums) {
                if (seen.containsKey(num) && seen.get(num) >= 1)
                    return true;
                seen.put(num, seen.getOrDefault(num, 0) + 1);
            }
            return false;
        }


        // Using Hash Set.
        static boolean usingHashSetContainsDuplicate(int[] nums) {
            HashSet<Integer> seen = new HashSet<>();
            for (int num : nums) {
                if (seen.contains(num))
                    return true;
                seen.add(num);
            }
            return false;
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
        System.out.print( containsDuplicate(arr));
//      System.out.println(usingSortingContainsDuplicate(arr));
//      System.out.println(usingHashMapContainsDuplicate(arr));
//      System.out.println(usingHashSetContainsDuplicate(arr));

    }
}
