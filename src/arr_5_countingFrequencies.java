//5 Counting frequencies of array elements
//Given an array which may contain duplicates, print all elements and their frequencies.
//
//        Examples:
//
//        Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
//        Output : 10 3
//                 20 4
//                 5  1
//
//        Input : arr[] = {10, 20, 20}
//        Output : 10 1
//                 20 2
//
//


import java.util.*;

public class arr_5_countingFrequencies {

    static void countingFrequencies(int []arr){
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())    //using map.entrySet() for iteration
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
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
        countingFrequencies(arr);
    }

}
