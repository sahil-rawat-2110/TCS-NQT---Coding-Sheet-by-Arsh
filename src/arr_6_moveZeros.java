//6 Move Zeroes
//
//Given an integer array nums, move all 0's to the end of it while maintaining the relative
//order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
//
//

import java.util.Scanner;

public class arr_6_moveZeros {

    static void movesZeros(int []arr){
        int i = 0;
        int n = arr.length;
        for (int num:arr){
            if(num != 0){
                arr[i] = num;
                i++;
            }
        }
        while(i<n){
            arr[i] = 0;
            i++;
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
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
        movesZeros(arr);
    }
}








      //BRUTE FORCE APPROACH**
// int n = arr.length;
// List<Integer> temp=new ArrayList<Integer>();
// for(int i=0; i<n; i++ ){
//     if(arr[i]!=0){
//         temp.add(arr[i]);
//     }
// }
// int m = temp.size();
// for(int i=0; i<m; i++ ){
//     arr[i]=temp.get(i);
// }
// for(int i=m; i<n; i++){
//     arr[i]=0;
// }
// for (int j = 0; j < n; j++) {
//     System.out.print(arr[j] + " ");
// }



