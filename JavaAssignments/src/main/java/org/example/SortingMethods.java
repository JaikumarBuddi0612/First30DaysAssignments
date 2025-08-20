package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingMethods {
    public static void merge(int left,int mid,int right,List<Integer> arr){
        List<Integer> temp = new ArrayList<>();
        int l=left,r=mid+1;
        while(l<=mid && r<=right){
            if(arr.get(l)<arr.get(r)){
                temp.add(arr.get(l));
                l++;
            }
            else{
                temp.add(arr.get(r));
                r++;
            }
        }
        while(l<=mid){
            temp.add(arr.get(l));
            l++;
        }
        while(r<=right){
            temp.add(arr.get(r));
            r++;
        }
        for(int i=left;i<=right;i++){
            arr.set(i,temp.get(i-left));
        }
    }
    public static void mergeSort(int left, int right,List<Integer> arr){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(left,mid,arr);
        mergeSort(mid+1,right,arr);
        merge(left,mid,right,arr);
    }
    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,4,5,2,4,56);
        mergeSort(0,arr.size()-1,arr);
        System.out.println(arr);
    }
}
