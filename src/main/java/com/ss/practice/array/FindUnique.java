package com.ss.practice.array;

/**
 *Problem Statement
 *You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
 *Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
 *You need to find and return that number which is unique in the array/list.
 *
 *Input : 2 3 1 6 3 6 2
 *O/P : 1
 */

public class FindUnique {

    public static void main(String[] args) {
        System.out.println("Unique element is "+findUnique(new int[]{1,2,3,1,2}));
        System.out.println("Unique element is "+findUnique(new int[]{1,3,1,3,6,6,7,10,7}));
        System.out.println("Unique element is "+findUnique(new int[]{2,4,7,2,7}));
    }
    public static int findUnique(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
           ans=ans^arr[i];
     return ans;
    }

}
