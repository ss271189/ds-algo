package com.ss.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PairSum {

    public static void main(String[] args) {
        int arr[]={2, -3 ,3 ,3 ,-2};
        pairSum(arr,0);
    }


    public static int[][] pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==s){
                list.add(arr[i]);
                if(arr[j]==arr[j-1]&& j>i){
                    j--;
                } else if(arr[i]==arr[i+1]&&i<j){
                    i++;
                } else {
                    i++;j++;
                }
            } else if(arr[i]+arr[j]>s){
                j--;
            } else {
                i++;
            }
        }
        int[][] result=new int[list.size()][2];
        for(i=0;i<list.size();i++)
        {
            result[i][0]=list.get(i);
            result[i][1]=s-list.get(i);

        }
        return result;
    }
}
