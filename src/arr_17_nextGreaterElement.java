//17 Next Greater Element I
//The next greater element of some element x in an array is the first greater element that is to the
// right of x in the same array.
//
//You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
//
//For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the
// next greater element of nums2[j] in nums2. If there is no next greater element, then the answer
// for this query is -1.
//
//Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
//
//
//
//Example 1:
//
//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//Example 2:
//
//Input: nums1 = [2,4], nums2 = [1,2,3,4]
//Output: [3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
//- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.


import java.util.Scanner;

public class arr_17_nextGreaterElement {
        static int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] nums3 = new int[nums1.length];

            for (int i = 0; i < nums3.length ; i++)
            {
                nums3[i] =  findNextMaxNum(nums2 , nums1[i]);
            }
            return nums3;
        }

        static int findNextMaxNum(int[] arr , int n )
        {
            int temp = -1 ;
            for (int i = 0 ; i < arr.length ; i++)
            {
                if (arr[i] == n) {
                    while ((i + 1) < arr.length && temp <= n) {
                        i++;
                        temp = Math.max(n, arr[i]);
                    }
                    break;
                }
            }
            return (temp == n) ? -1 : temp ;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter element of array1 : ");
        int []arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter length of array 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Enter element of array 2 : ");
        int []arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int [] ans = nextGreaterElement(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
