package com.ss.practice.strings;

public class PermutationOfAGivenString {

    public static void main(String[] args) {
        permutation("ABC","");
    }
    public static void permutation(String str,String ros){
        if(str.length()==0)
            System.out.println(ros);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newRos=str.substring(0,i)+str.substring(i+1);
            permutation(newRos,ros+ch);
        }
    }

}
