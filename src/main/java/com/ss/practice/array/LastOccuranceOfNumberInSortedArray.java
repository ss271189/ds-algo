package com.ss.practice.array;

public class LastOccuranceOfNumberInSortedArray {


    public static void main(String[] args) {
        lastOccurance(new int[]{1,3,4,4,5,5,5,5,5,5,5,5,5,6,6,6,6,7},7);
    }


    public static void lastOccurance(int arr[],int n){
        int s=0;
        int e=arr.length-1;
        int mid=s+((e-s)/2);
        int position = 0;
        while(s<=e){
            if(arr[mid]==n){
                position=mid;
                s=mid+1;
            } else if(arr[mid]>n){
                e=mid-1;
            } else {
                s=mid+1;
            }
            mid=s+((e-s)/2);
        }

        System.out.println("Position "+(position+1));

    }

}
