package org.example;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(t.charAt(i)==map.get(s.charAt(i))){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),s.charAt(i));
            }
            else{
                if(s.charAt(i)==map.get(t.charAt(i))){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s=null;
        String t="add";
//        System.out.println(s.length());
        System.out.println(isIsomorphic(s,t));
    }
}
