package org.example;

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args){
        DuplicateCharacters obj = new DuplicateCharacters();
        String s= "jaikumar";
        System.out.println(obj.findDuplicates(s));
    }

    public String findDuplicates(String s) {
        String ans="";
        HashMap<Character,Integer> freq= new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        for(char ch : freq.keySet()){
            if(freq.get(ch)>1){
                ans+=ch;
            }
        }
        return ans;
    }
}
