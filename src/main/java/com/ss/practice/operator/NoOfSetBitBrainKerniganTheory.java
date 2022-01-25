package com.ss.practice.operator;

public class NoOfSetBitBrainKerniganTheory {

    public static void main(String[] args) {
        int number=14;
        int noOfSetBit=0;
        while (number!=0){
            number=number&(number-1);
            noOfSetBit++;
        }
        System.out.println("No Of Set Bit "+noOfSetBit);
    }
}
