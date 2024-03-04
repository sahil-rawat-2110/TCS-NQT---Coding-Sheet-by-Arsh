//12 Mean and median of an unsorted array
//Example:
//Input: a[] = {1, 3, 4, 2, 6, 5, 8, 7}
//        Output: Mean = 4.5, Median = 4.5
//        Explanation: Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36, Mean = 36/8 = 4.5
//        Since number of elements are even, median is average of 4th and 5th largest elements,
//        which means Median = (4 + 5)/2 = 4.5
//
//        Input: a[] = {4, 4, 4, 4, 4}
//        Output: Mean = 4, Median = 4



import java.util.*;

public class arr_12_meanAndMedianOfArray {

    static double mean(int[] arr){
        int n = arr.length;
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        return (double)sum / (double)n;
    }
    static double median(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        if (n%2!=0) {
            return arr[n/2];
        }
        else {
            return (double)(arr[(n-1)/2] + arr[n/2])/2.0;
        }

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
        System.out.println("Mean : " + mean(arr));
        System.out.println("Median : " + median(arr));
    }
}
