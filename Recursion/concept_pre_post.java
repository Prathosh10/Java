package com.Recursion;

public class concept_pre_post {
    public static void main(String[]args){
        fun(4);
    }
    static void fun(int n){
        /* if(n==0)
                return;
             System.out.println(n);
            fun(n--);
        */
        if(n==0)
            return;
        System.out.println(n);
        fun(--n);
    }
}
