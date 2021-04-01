package com.ss.practice.problem;

public class FizzBuzzProblem {
    public static void main(String[] args) {
        int c3 = 0;
        int c5 = 0;
        for (int a = 1; a <= 100; a++) {
            c3++;
            c5++;
            String s = "";
            if (c3 == 3) {
                s += "fizz";
                c3 = 0;
            }
            if (c5 == 5) {
                s += "buzz";
                c5 = 0;
            }
            if (s.equals("")) {
                System.out.println(a);
            } else
                System.out.println(s);
        }
    }
}
