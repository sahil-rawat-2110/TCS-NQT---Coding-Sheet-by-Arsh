//input:
//n=4
//
//Output:
//
//****
//   ****
//      ****
//         ****





import java.util.Scanner;

public class pattern {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < (n-1)*i; j++){
                    System.out.print(" ");
                }
                for(int k = 0; k <n ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}




//    Webkul Interview Coding Round Pattern
//
//        Examples:
//
//        Input : 3
//        Output :
//            @
//           @@@
//          @@@@@
//          *   *
//         **@@@**
//          *   *
//
//
//
//
//
//        Input : 5
//        Output :
//            @
//           @@@
//          @@@@@
//         @@@@@@@
//         *     *
//        **     **
//       ***@@@@@***
//        **    **
//         *    *



//
//import java.util.*;
//
//public class pattern{
//
//    // Driver Code
//    public static void main(String[] args)
//    {
//        int n, i, j;
//        Scanner s = new Scanner(System.in);
//
//        n = s.nextInt();
//
//        for(i = 0; i < (n / 2) + 2; i++)
//        {
//            for(j = 0; j < n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            for(j = 0; j < 2 * i + 1; j++)
//            {
//                System.out.print("@");
//            }
//            System.out.println();
//        }
//
//        for(i = 0; i < n; i++)
//        {
//            for(j = 0; j < (n / 2) + 1; j++)
//            {
//                if (j >= n / 2 - i && j >= i - n / 2)
//                {
//                    System.out.print("*");
//                }
//                else
//                    System.out.print(" ");
//            }
//            for(j = 0; j < n; j++)
//            {
//                if (i == n / 2)
//                    System.out.print("@");
//                else
//                    System.out.print(" ");
//            }
//            for(j = 0; j < (n / 2) + 1; j++)
//            {
//                if (j >= n / 2 - i && j >= i - n / 2)
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}







//  Other pattern question.


//public class pattern {
//    public static void main(String[] args) {
//        int i,j;
//        for(i=1;i<=4;i++) {
//            for (j=1;j<=4-i;j++) {
//                System.out.print(" ");
//            }
//            for(j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            for(j=i-1;j>=1;j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(i=3;i>=1;i--) {
//            for(j=1;j<=4-i;j++) {
//                System.out.print(" ");
//            }
//            for(j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            for(j=i-1;j>=1;j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
