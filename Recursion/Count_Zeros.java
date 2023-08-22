package com.Recursion;

public class Count_Zeros {
    public static void main(String[]args){
        int n=101010;
        int ans=CountZ(n);
        System.out.println(ans);

        int d=(int)(Math.log10(n))+1;
        System.out.println(CountZ1(n,d));  // another function
    }
    static int CountZ(int n){
        return helper(n,0);
    }
    private static int helper(int n,int count){
        int rem=n%10;
        if (n==0){
            return count;
        }
        if (rem==0)
            return helper(n/10,count+1);
        return helper(n/10,count);
    }
    static int CountZ1(int n,int d){
        int count=0;
        if (n==0){
            return count;
        }
        if (n%10==0)
            return (count+1)+(CountZ1(n/10,d-1));
        return CountZ1(n/10,d-1);
    }
}

/*
    public static void main(String[]args){
        int n=1020304050;
        int d=(int)(Math.log10(n))+1;
        int ans=CountZ(n,d);
        System.out.println(ans);
    }
    static int CountZ(int n,int d){
        int count=0;
        if (d==0){
            return count;
        }
        if (n%10==0)
            return (count+1)+(CountZ(n/10,d-1));
        return count+CountZ(n/10,d-1);
    }
*/
