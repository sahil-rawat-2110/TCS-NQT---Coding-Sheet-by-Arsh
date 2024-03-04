//17.  Roots of Quadratic equation
//Given a quadratic equation in the form ax2 + bx + c, (Only the values of a, b and c are provided)
// the task is to find the roots of the equation.
//Input:  a = 1, b = -2, c = 1
//        Output:  Roots are real and same 1
//        Input  :  a = 1, b = 7, c = 12
//        Output:  Roots are real and different
//        -3, -4
//
//        Input  :  a = 1, b = 1, c = 1
//        Output :  Roots are complex
//        -0.5 + i1.73205, -0.5 – i1.73205
//
//        Roots of Quadratic Equation using Sridharacharya Formula:
//        The roots could be found using the below formula (It is known as the formula of Sridharacharya)
//
//        {-b + √(b2 – 4ac)}/2a and {-b – √(b2 – 4ac)}/2a.
//
//        The values of the roots depends on the term (b2 – 4ac) which is known as the discriminant (D).
//
//        If D > 0:
//        => This occurs when b2 > 4ac.
//        => The roots are real and unequal.
//        => The roots are {-b + √(b2 – 4ac)}/2a and {-b – √(b2 – 4ac)}/2a.
//
//        If D = 0:
//        => This occurs when b2 = 4ac.
//        => The roots are real and equal.
//        => The roots are (-b/2a).
//
//        If D < 0:
//        => This occurs when b2 < 4ac.
//        => The roots are imaginary and unequal.
//        => The discriminant can be written as (-1 * -D).
//        => As D is negative, -D will be positive.
//        => The roots are {-b ± √(-1*-D)} / 2a = {-b ± i√(-D)} / 2a = {-b ± i√-(b2 – 4ac)}/2a where i = √-1.
//

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.*;

public class rootOfQuadraticEquation {

    static void findsRootsOfEquation(int a, int b, int c){
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }

        int d = b * b - 4 * a * c;
        double sqrt_val = Math.abs(Math.sqrt(d));

        if (d > 0) {
            System.out.println("Roots are real and different \n");
            System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n" + (double)(-b - sqrt_val) / (2 * a));
        }
        else if (d == 0) {
            System.out.println("Roots are real and same \n");
            System.out.println(-(double)b / (2 * a) + "\n" + -(double)b / (2 * a));
        }
        else // d < 0
        {
            System.out.println("Roots are complex \n");
            System.out.println(-(double)b / (2 * a) + " + i"
                    + (double)Math.sqrt(-d) / (2 * a) + "\n"
                    + -(double)b / (2 * a)
                    + " - i"
                    + (double)Math.sqrt(-d) / (2 * a));

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter value of c : ");
        int c = sc.nextInt();
        System.out.println("the root of quadratic equation " + a+"x^2+"+b+"x+"+c+ " is : ");
        findsRootsOfEquation(a,b,c);

    }
}
