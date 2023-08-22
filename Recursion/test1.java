package com.Recursion;

public class test1 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        System.out.println("welcome");
        if (n!=1)
            print(n-1);
    }
}
