//9 Find duplicates in O(n) time and O(1) extra space
//Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times.
// Find these repeating numbers in O(n) and using only constant memory space.
//
//Example:
//
//Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
//Output: 1, 3, 6
//
//Explanation: The numbers 1 , 3 and 6 appears more
//than once in the array.
//
//Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
//Output: 3
//
//Explanation: The number 3 appears more than once
//in the array.


import java.util.*;
//Time Complexity : O(nlogn) Space Complexity: O(n) by using merge sort.
public class arr_9_findDuplicate {
    static void findDuplicate(int[] arrA) {
            Arrays.sort(arrA);
            for (int i = 0; i < arrA.length-1; i++) {
                if(arrA[i]==arrA[i+1]){
                    System.out.println("Array has duplicates : " + arrA[i]);
                }
            }
        }

//    Time Complexity : O(n) and Space Complexity: O(n).
    static void hasDuplicatesUsingMap(int [] arrA){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arrA.length ; i++) {
            if(map.containsKey(arrA[i])){
                System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
            }else{
                map.put(arrA[i], 1);
            }
        }
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
//        findDuplicate(arr);
        hasDuplicatesUsingMap(arr);
    }
}
