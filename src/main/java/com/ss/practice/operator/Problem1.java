package com.ss.practice.operator;

// To find the number n is in form of 2^x =n where x can be anything and n is a integre

public class Problem1 {

    public static void main(String[] args) {
        // As integer has 32 bit and any number to be in form of 2^x form it should be among 2^0,.... 2^31

        int input = Integer.MAX_VALUE/2+1;
        boolean flag = true;
        int i = 1;
        if (input == 0) {
            System.out.println("YES");
            flag = false;
            i=33;
        }
        int num = 1;
        while (i++ < 32) {
            num = num * 2;
            if (num == input) {
                System.out.println("YES");
                flag = false;
                break;
            } else if (input < num) {
                break;
            }
        }
        if (flag) {
            System.out.println("NO");
        }
        System.out.println("value of i "+i);
    }
}
