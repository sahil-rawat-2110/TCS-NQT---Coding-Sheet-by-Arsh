// 19 Fizz Buzz

//Given an integer n, return a string array answer (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.
//
//
//        Example 1:
//
//        Input: n = 3
//        Output: ["1","2","Fizz"]
//        Example 2:
//
//        Input: n = 5
//        Output: ["1","2","Fizz","4","Buzz"]
//        Example 3:
//
//        Input: n = 15
//        Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]

import java.util.*;

public class str_19_fizzBuzz {
    static List<String> fizzBuzz(int n) {
        List<String> arr = new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(i%3==0 && i%5==0)
                arr.add("FizzBuzz");
            else if(i%5==0)
                arr.add("Buzz");
            else if(i%3 == 0)
                arr.add("Fizz");
            else{
                String s =String.valueOf(i);
                arr.add(s);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        List<String> ans = fizzBuzz(n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + "  ");
        }

    }
}
