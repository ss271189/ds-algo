package com.ss.practice.array;

public class ArrayRotation  {


    public static int[] rotateArray(int arr[], int d){
        int size=arr.length;
        //if array and rotation length are same or the rotation count is zero then return same array
        if(d==0 || d==size){
            return arr;
        }
        int actualRotation= d%size;
        int tempArray[]=new int[size];
        int j=0;
        for(int i=d;i<size;i++,j++)
            tempArray[j]=arr[i];
        for(int i=0;i<d;i++,j++)
            tempArray[j]=arr[i];
        return tempArray;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arrNew[]=rotateArray(arr,0);
        for(int j=0;j<arrNew.length;j++)
        System.out.print(arrNew[j]+" ");
        System.out.println();
    }
}
