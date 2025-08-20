package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Removes_Duplicates {
    public static int duplicateCount(List<Integer> arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int cnt=0;
        for(int key : map.keySet()){
            if(map.get(key)>1){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3,2,2,3);
        System.out.println(duplicateCount(list));
    }
}
