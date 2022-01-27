package com.ss.practice.problem;

public class Sort0sAnd1s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        sort0sAnd1s(arr);
    }

    public static void sort0sAnd1s(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            while (arr[i] == 0 && i < j) {
                i++;
            }
            while (arr[j] == 1 && i < j) {
                j--;
            }
            if (i < j) {
                arr[i] = 0;
                arr[j] = 1;
            }
        }
        System.out.println("[");
        for (i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }


}
