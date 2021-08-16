package com.ss.practice.problem;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    //Sliding window technique
    public static void main(String[] args) {
        int len=longestSubstring("ABDEFGABEF");
        System.out.println(len);
    }


    public static int longestSubstring(String s){
        int max=0;
        int i=0,j=0;
        Set<Character> seen=new HashSet<>();
        while(j< s.length()){
            char ch=s.charAt(j);
            if(!seen.contains(ch)){
                seen.add(ch);
                j++;
                max= maxOf(max,seen.size());
            } else {
               seen.remove(s.charAt(i));
               i++;
            }
        }
      return max;
    }

    public static int maxOf(int a,int b){
        return (a>b)?a:b;
    }
}
