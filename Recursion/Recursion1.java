package com.Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        printnum(1);
        System.out.println(" ");
        easyPrintNum(3);
        System.out.println(" ");
        easy(1);
        System.out.println(" ");
        printRange(1,10);
    }
    static void printnum(int n){
        System.out.print(n+" ");
        printnum2(2);
    }
    static void printnum2(int n){
        System.out.print(n+" ");
        printnum3(3);
    }
    static void printnum3(int n){
        System.out.print(n+" ");
    }

    // use instead of
    static void easyPrintNum(int n){
        System.out.print(n+" ");
        if (1<n) {
            easyPrintNum(n-1);
        }
    }

    static void easy(int n){
        System.out.print(n+" ");
        if (n < 5){
            easy(n+1);
        }
    }

    // Method for print (start to end) range
    static void printRange(int start,int end){
        System.out.print(start+" ");
        if(start < end){
            printRange(start+1,end);
        }
    }
}
