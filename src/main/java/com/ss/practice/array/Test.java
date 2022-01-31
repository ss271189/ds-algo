package com.ss.practice.array;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

        Integer i1=100;
        Integer i2=100;
        Integer i3=200;
        Integer i4=200;
        if(i1==i2)
            System.out.println("100 and 100"+"Equal");
        if(i3==i4)
            System.out.println("200 and 200"+"Equal");

        System.out.println(1&4);
         Collection<Integer> col= new ArrayList<>();
         col.add(1);
        col.add(2);
        col.add(3);
        Collection<Integer> col1= new ArrayList<>();
        col1.add(2);
        col1.add(3);
        col1.add(4);
        System.out.println(getModels(true,new HashSet<>(col),new HashSet<>(col1)));



    }

    public static Collection<Integer> getModels(boolean associate, Set<Integer> existingModel, Set<Integer> newModels){
        if (associate){
            existingModel.addAll(newModels);
        } else {
            existingModel.removeAll(newModels);
        }
        return existingModel;
    }
}





