package com.ss.practice.array;

public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray obj=new ReverseArray();
        obj.reverseArray(new int[]{1,2,3,4,5,6,7,8,9});
        obj.reverseArray(new int[]{1});
        obj.reverseArray(new int[]{1,1,1,1,1,1});
    }



    public void reverseArray(int[] arr){
        if(arr==null) return;
        int start=0, end= arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

        for(int a: arr){
            System.out.print(a+" - ");
        }
        System.out.println();
    }

    public void swap(int[] arr, int indexA, int indexB){
        arr[indexA]=arr[indexA]+ arr[indexB];
        arr[indexB]= arr[indexA]- arr[indexB];
        arr[indexA]= arr[indexA]- arr[indexB];
    }
}
