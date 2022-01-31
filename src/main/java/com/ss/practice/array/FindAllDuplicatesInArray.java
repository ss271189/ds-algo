package com.ss.practice.array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {
        //findDuplicateUsingHashSet(new int[]{1,2,3,4,5,1,2});
        findDuplicate(new int[]{1,2,3,4,5,1,2});
    }



    public static void findDuplicateUsingHashSet(int arr[]){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
           if(!set.add(arr[i])){
               System.out.println(arr[i]);
           }
        }
    }

    // condition number should be between 1 to n and N being the size of the array
    public static void findDuplicate(int arr[]){
        for(int i=0;i< arr.length;i++){
             int num= Math.abs(arr[i]);
             if(arr[num]<0){
                 System.out.println(num);
             }
             arr[num]=-arr[num];

        }
    }

}
