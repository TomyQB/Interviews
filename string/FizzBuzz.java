package string;

import java.util.ArrayList;
import java.util.List;

/*
    Input: n = 3
    Output: ["1","2","Fizz"]
*/

/*
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]
*/

/*
    Input: n = 15
    Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
*/

public class FizzBuzz {

    public static void main(String[] args) {

        // ------------------- 1 -------------------
        int n1 = 3;
        for (String s : fizzBuzz(n1)) {
            System.out.print(s + " ");
        }

        System.out.println();

        // ------------------- 2 -------------------
        int n2 = 5;
        for (String s : fizzBuzz(n2)) {
            System.out.print(s + " ");
        }

        System.out.println();

        // ------------------- 3 -------------------
        int n3 = 15;
        for (String s : fizzBuzz(n3)) {
            System.out.print(s + " ");
        }

    }

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
