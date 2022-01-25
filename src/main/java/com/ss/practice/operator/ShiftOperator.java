package com.ss.practice.operator;

public class ShiftOperator {
    public static void main(String[] args) {
        //Gets padded by zero excluding sign bit
        System.out.println("2 << 2 -> "+(2<<2));
        System.out.println("3 >> 1 -> "+(2>>1));
        System.out.println("8 >> 2 -> "+(8>>2));
        System.out.println("8 >> 4 -> "+(8>>4));
        System.out.println("-2 << 1 -> "+(-2<<1));
        System.out.println("-2 >> 1 -> "+(-2>>1));
        System.out.println("-8 >> 1 -> "+(-8>>1));
    }
}
