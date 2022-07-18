package com.ss.practice.array;
//Should be in sorted order
public class FindPivotElement {

    public static void main(String[] args) {
     findPivotElement(new int[]{7,8,9,10,11,12,13,14,15,2,3,4,5});
    }

    public static void findPivotElement(int arr[]){
        int s=0;
        int e=arr.length-1;
        int mid =(s+e)/2;
        while (s<e){
            if(arr[mid]>arr[0]){
                s=mid+1;
            } else if(arr[mid]< arr[arr.length-1]){
                e=mid;
            }
            mid =(s+e)/2;
        }
        System.out.println("Pivot"+arr[mid]);
    }


}



