package com.ss.practice.array;

public class FindPeakOfMountainArray {

    public static void main(String[] args) {
        findPeak(new int[]{1,2,3,4,5,6});
        findPeak(new int[]{1,2,3,4,5,7,3,2,1});
    }


    public static void findPeak(int arr[]){

        int start=0;
        int end=arr.length-1;
        int mid=start+((end-start)/2);
        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else {
                end=mid;
            }
            mid=start+((end-start)/2);
        }
        System.out.println("Peak is "+arr[mid]);
    }
}
