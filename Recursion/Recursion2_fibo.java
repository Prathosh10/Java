package com.Recursion;

public class Recursion2_fibo {
    public static void main(String[]args){
        // fibbonocci series
        fib(5);
        // fibbonocci single number
        System.out.println(" ");
        System.out.println(fib11(60)); // using while loop
        System.out.println(fib1(60));
    }
    static void fib(int n){
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2+" ");
        for (int i=1;i<n;i++){
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }

    static int fib1(int n){
        if (n<=1)
            return n;
        return fib1(n-1)+fib1(n-2);
    }

    static int fib11(int n){ // using while loop
        int n1=0;
        int n2=1;
        int n3=0;
        while (1<n){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            n--;
        }
        return n3;
    }
}
