package org.example;

import org.apache.poi.hssf.record.DVALRecord;

public class DBConnection {
    private static DBConnection instanceVariable=null;
    private DBConnection(){}
    public static DBConnection DBConnection(){
        if(instanceVariable==null){
            instanceVariable = new DBConnection();
        }
        return instanceVariable;
    }
    public static void main(String[] args){
        DBConnection obj = new DBConnection();
        DBConnection a = DBConnection.DBConnection();
        DBConnection b= DBConnection.DBConnection();
        DBConnection c= DBConnection.DBConnection();
        System.out.println(obj.hashCode());
        System.out.println(a.hashCode());
        if(obj==a){
            System.out.println("obj == a");
        }
        if(a==b){
            System.out.println("A == B");
        }
        if(b==c){
            System.out.println("B == C");
        }
        if(c==a){
            System.out.println("C == D");
        }
    }
}
