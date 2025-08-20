package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public static void helper(int i,int j,String temp,String num,Map<Character,String> map,List<String> ans){
        if(temp.length()==num.length()){
//            System.out.println(temp);
            ans.add(new String(temp));
            return;
        }
        if(i==num.length()){
            return;
        }
        if(j==map.get(num.charAt(i)).length()){
            return;
        }
        String s= map.get(num.charAt(i));
        String t=temp+s.charAt(j);
        System.out.println(t);
        helper(i+1,0,t,num,map,ans);
        helper(i,j+1,temp,num,map,ans);
    }
    public static List<String> findCombinations(String num, Map<Character,String> map){
        List<String> ans = new ArrayList<>();
        helper(0,0,"",num,map,ans);
        return ans;
    }
    public static void main(String[] args){
        String num="23";
        Map<Character,String> map = Map.of(
                '2' ,"abc",
                '3' , "def",
                '4',"ghi",
                '5',"jkl",
                '6',"mno",
                '7',"pqrs",
                '8',"tuv",
                '9',"wxyz"
        );
        List<String> ans = findCombinations(num,map);
        System.out.println(ans);
    }
}
