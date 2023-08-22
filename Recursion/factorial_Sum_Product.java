package com.Recursion;

public class factorial_Sum_Product {
    public static void main(String[] args) {
        int ans=fact(5); // factorial
        System.out.println(ans);
        int ans1=sum(5); // sum of n numbers
        System.out.println(ans1);
        int ans2=SoD(12304); // sum of digits
        System.out.println(ans2);
        int ans3=PoD(12385); // Product of digits
        System.out.println(ans3);

    }
    static int fact(int n){
       /* if (n !=1)
            return n* fact(n-1);
        return n;
        */
        if (n<=1)
            return 1;
        return n*fact(n-1);
    }
    // for sum of n numbers
    static int sum(int n){
        if (n<=1)
            return 1;
        return n+sum(n-1);
    }
    //Sum of digits

    static int SoD(int n){
        int rem=n%10;
        if(n != 0)
            return rem+SoD(n/10);
        return 0;
    }
    //Product of digits
    static int PoD(int n){
        if (n==0 || n==1){
            return 1;
        }
        return (n%10)*PoD(n/10);
    }
}

