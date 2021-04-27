package com.ss.practice.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MergeTwoList {

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        List<Integer> l2=new ArrayList<>();
        l2.add(2);
        l2.add(3);

        merge(l1,l2);

        Set set =new TreeSet<String>();
        set.add(100);
        set.add("123");
        System.out.println(set);

    }

    public static void merge(List<Integer> l1,List<Integer> l2){
        Set set=new TreeSet(l1);
        set.addAll(l2);
        System.out.println(set);

    }
}
