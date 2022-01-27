package com.ss.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. You have to find the intersection of these two arrays.
 * Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.
 * 1 2 2 2 3 4
 * 2 2 3 3
 * O/P : 2 2 3
 * <p>
 * 1 2 3
 * 3 4
 * O/P : 3
 */
public class ArrayIntersection {

    public static void main(String[] args) {
        System.out.println(findArrayIntersection(List.of(1,2,2,2,3,4),6,List.of(2,2,3,3),4));

    }

    public static ArrayList<Integer> findArrayIntersection(List<Integer> arr1, int n, List<Integer> arr2, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i).equals(arr2.get(j))) {
                list.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return list;
    }

}
