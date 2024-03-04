//10 Print array after it is right rotated K times
//Given an Array of size N and a values K, around which we need to right rotate the array.
// How to quickly print the right rotated array?
//Examples :
//
//Input: Array[] = {1, 3, 5, 7, 9}, K = 2.
//Output: 7 9 1 3 5
//Explanation:
//After 1st rotation - {9, 1, 3, 5, 7}
//After 2nd rotation - {7, 9, 1, 3, 5}
//Input: Array[] = {1, 2, 3, 4, 5}, K = 4.
//Output: 2 3 4 5 1


import java.util.Scanner;

public class arr_10_printArrayAfterItIsRightRotated_K_times {
    // Function to rightRotate array
    static void rightRotate(int a[], int n, int k){

        // If rotation is greater than size of array
        k=k%n;
        for(int i = 0; i < n; i++){
            if(i<k){
                // Printing rightmost kth elements
                System.out.print(a[n + i - k] + " ");
            }
            else{
                // Prints array after 'k' elements
                System.out.print(a[i - k] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter element of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        System.out.println("Enter K value : ");
        int k = sc.nextInt();
        rightRotate(arr, length, k);
    }
}
