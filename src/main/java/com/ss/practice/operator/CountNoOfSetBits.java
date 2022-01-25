package com.ss.practice.operator;

public class CountNoOfSetBits {
    public static void main(String[] args) {

        int number =10;
        int noOfSetBits=0;

        while(number>0){
            if((number&1)==1){
                noOfSetBits++;
            }
            number=number>>1;
        }
        System.out.println("No of Set bits "+noOfSetBits);
    }

}
