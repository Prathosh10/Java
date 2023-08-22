package com.Recursion;

public class Reverse_number {
    public static void main(String[]args){
       int ans=rev(43201);
        System.out.println(ans);

    }
    static int rev(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n)
            return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
// method 1
/*      int r=n%10;
        System.out.print(r);
        if(n!=1){
            return reverse(n/10);
        }
        return n;
*/
// method 2
/*
static int sum=0;
static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=(sum*10)+rem;
        reverse(n/10);
}
 */
