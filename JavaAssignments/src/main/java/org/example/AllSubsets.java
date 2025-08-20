package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets {
    public static void findSubsetsHelper(List<Integer> l,List<Integer> nums,int i,List<List<Integer>> ans){
        if(i>=nums.size()){
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums.get(i));
        findSubsetsHelper(l,nums,i+1,ans);
        l.remove(l.size()-1);
        findSubsetsHelper(l,nums,i+1,ans);
    }
    public static List<List<Integer>> findSubsets(List<Integer> nums){
        List<List<Integer>> ans = new ArrayList<>();
        findSubsetsHelper(new ArrayList<>(),nums,0,ans);
        return ans;
    }
    public static void main(String[] args){
        List<Integer> nums= Arrays.asList(1,2,3);
        List<List<Integer>> req= findSubsets(nums);
        for(List<Integer> l : req){
            System.out.println(l);
        }
    }
}
