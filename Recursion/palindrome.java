package com.Recursion;

public class palindrome {
    public static void main(String[] args) {
        int n=1251;
        int rev=rev(n);
        boolean ans=palindrome(n,rev); // check palindrome
        System.out.println("n= "+n+" rev= "+rev);
        System.out.println(ans);
    }
    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;   // we can also create a function for digit count
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n)
            return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static boolean palindrome(int n,int rev){
        if (n==rev)
            return true;
        return false;
    }

}

