package com.ss.practice.array;

public class Sort012 {

    public static void main(String[] args) {
        sort0s1s2s(new int[]{0,1,2,2,2,2,0,1,2,2,1,1,0});
    }

    public static void sort0s1s2s(int arr[]){

        int start=0;
        int mid=0;
        int end= arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                arr[mid++]=arr[start];
                arr[start++]=0;
            } else if(arr[mid]==1){
               mid++;
            } else {
                arr[mid]=arr[end];
                arr[end--]=2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
