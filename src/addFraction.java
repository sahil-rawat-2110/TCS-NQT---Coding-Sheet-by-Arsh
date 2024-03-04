//8 Program to add two fractions


import java.util.Scanner;

public class addFraction {

    static void addFraction(int num1, int den1, int num2, int den2){
        int finalNum = 0, finalDen = 0;
        int num3 = ((den2*num1) + (num2*den1));
        int den3 = (den1*den2);
        if(num3>den3){
            for(int i = 2; i<=den3; i++){
                if(num3%i==0 && den3%i == 0){
                     finalNum = num3/i;
                     finalDen = den3/i;
                }
            }

        }

        else if(num3<den3){
            for(int i = 2; i<=num3; i++){
                if(num3%i==0 && den3%i == 0){
                     finalNum = num3/i;
                     finalDen = den3/i;
                }
            }
        }
        else {
            finalNum = 1;
            finalDen = 1;
        }
        System.out.println(finalNum + "/" + finalDen);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first numerator : ");
        int numerator1 = sc.nextInt();
        System.out.println("enter first denometer : ");
        int denometer1 = sc.nextInt();
        System.out.println("enter second numerator : ");
        int numerator2 = sc.nextInt();
        System.out.println("enter second denometer : ");
        int denometer2 = sc.nextInt();

        System.out.println(numerator1+"/"+ denometer1 + " + " + numerator2 + "/" + denometer2 + " is equal to:  ");
        addFraction(numerator1, denometer1, numerator2, denometer2);


    }
}
