package org.example;

import java.util.*;

public class ReformatDate {
    public static void main(String[] args) {
        List<String> months= Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] dateList= date.split(" ");
        String ans="";
        ans+=dateList[2]+"-";
        ans+=(months.indexOf(dateList[1])+1)+"-";
        for(char ch : dateList[0].toCharArray()){
            if(ch=='t' || ch=='s' || ch=='n' || ch=='r'){
                break;
            }
            ans+=ch;
        }
        System.out.println(ans);
        System.out.println(date);
    }
}
