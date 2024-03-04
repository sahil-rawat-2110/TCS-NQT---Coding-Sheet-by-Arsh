//16.  Permutations to arrange N persons around a circular table
//Given N, the number of persons. The task is to arrange N person around a circular table.
//Examples:
//
//Input: N = 4
//Output: 6
//
//Input: N = 5
//Output: 24
//Below is the formula to find Circular permutations:
//   Circular Permutations = (N - 1)!


import java.util.Scanner;

public class permutation {

    static int circularPermutation(int num){
        int n = num-1;
        int result = 1;
        for(int i = 1; i <= n; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : " );
        int num = sc.nextInt();
        System.out.println(circularPermutation(num));

    }
}
