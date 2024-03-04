//4 Pascal's Triangle
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
//        Example 1:
//
//        Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//        Example 2:
//
//        Input: numRows = 1
//        Output: [[1]]


import java.util.Scanner;

public class arr_4_pascalsTriangle {

    static void printMatrix(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int [][] pascalTriangle(int n){
        int [][] ans = new int [n][];
        for (int i = 0; i < n; i++) {
            ans[i] = new int[i+1];     // ith row has i+1 column
            ans[i][0] = ans[i][i] = 1;   // 1st and last element of every row is 1
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        int [][] ans = pascalTriangle(n);
        printMatrix(ans);
    }
}





// ------------leetcode-----------------
//class Solution {
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> triangle = new ArrayList<>();
//
//        if (numRows == 0) {
//            return triangle;
//        }
//
//        List<Integer> firstRow = new ArrayList<>();
//        firstRow.add(1);
//        triangle.add(firstRow);
//
//        for (int i = 1; i < numRows; i++) {
//            List<Integer> row = new ArrayList<>();
//            row.add(1);
//
//            for (int j = 1; j < i; j++) {
//                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
//                row.add(value);
//            }
//
//            row.add(1);
//            triangle.add(row);
//        }
//
//        return triangle;
//    }
//}