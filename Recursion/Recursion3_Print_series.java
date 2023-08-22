package com.Recursion;

public class Recursion3_Print_series {
    public static void main(String[]args){
        int n=10;
        printseries(1,n);
        System.out.println(" ");
        printnum(n); // only use nth number
        System.out.println(" ");
        printboth(n);
    }
    static void printseries(int s,int e){
        System.out.print(s+" ");
        if (s<e)
            printseries(s+1,e);
    }
    static void printnum(int n){
        if (1<n){
            printnum(n-1);
        }
        System.out.print(n+" ");
    }
    static void printboth(int n){
        System.out.print(n+" ");
        if (1<n){
            printboth(n-1);
        }
        System.out.print(n+" ");
    }
}
